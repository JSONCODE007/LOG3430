package main;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import liste_tp3.ListeChaineeImpl;
import liste_tp3.MyListImpl;

/**
 * la fonction test la liste chainee via EC 
 * @author thierno and Tomas 
 *
 */
public class EC {
	
	ArrayList<Object> ensembleTest = new ArrayList<Object>(Arrays.asList(4,1));
	ArrayList<Object> ensembleTest1 = new ArrayList<Object>(Arrays.asList(12,67));

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * 2 listes normales
	 *  union operation test case
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(4,1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(4,1,2,3));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[4,1], [2,3], [4,1,2,3]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  The fuction take 2 normal lists 
	 *   intersection operation test case
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest() throws IOException {
		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(4,7,8,1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(2,3,8,4,7));
		ArrayList<Object> intersectVal1Val2 = new ArrayList<Object>(Arrays.asList(4,7,8));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[4,7,8,1], [2,3,8,4,7], [8,4,7]]",isMyListAreEquals(exceptedResult,toTest));
	}
	/**
	 * val1: Doublon 
	 * val2:ensemble non vide
	 * difference  operation  test case
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest() throws IOException {
		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(4,7,8,1,1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(2,3,8,4,7));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(1,1));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[4,7,8,1], [2,3,8,4,7], [1]]",isMyListAreEquals(exceptedResult,toTest));

	}
	/***
	 * test case : 
	 * val1 est un ensemble vide 
	 * val2 ensemble non-vide
	 * symetric difference operation test case
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest() throws IOException{
		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(2,3,8,4,7));
		ArrayList<Object> symetricDiffVal1Val2 = new ArrayList<Object>(Arrays.asList(2,3,8,4,7));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symetricDiffVal1Val2);

		assertTrue("Resultat de la symmetric difference doit etre [[4,7,8,1], [2,3,8,4,7], [1,2,3]]",isMyListAreEquals(exceptedResult,toTest));
	}
	/***
	 * 2 listes normales
	 * is subset operation test case
	 * @throws IOException 
	 */
	@Test
	public void isSubserOpTest() throws IOException{
		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(1,3,5));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(1,9,4,8,3,11,5));
		ArrayList<Object> subSetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(subSetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[1,3,5], [1,9,4,8,3,11,5], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	/***
	 * 2 listes normales
	 * is superset operation test case 
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest() throws IOException{
		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(1,3,5));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(1,9,4,8,3,11,5));
		ArrayList<Object> superSetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(superSetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[1,3,5], [1,9,4,8,3,11,5], [false]]",isMyListAreEquals(exceptedResult,toTest));


	}
	/**
	 * 2 listes non vides
	 * invalid operation test case 
	 */
	@Test
	public void invalidOpTest() throws IOException{
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(1,2));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(1,3));
		//given values for test proposal
		ListeChainee suiteChainee= new ListeChaineeImpl();
		MyList toTest = suiteChainee.build("invalid", val1, val2);
		//pass("Specied Operation not supported");
	}
	
	/**
	 * test de l ajout d'un ensemble a une liste
	 */
	@Test
	public void  addTest(){
		//add new list 
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		assertEquals("Apres un ajout ,la taille de liste  doit etre 1 ",1,toTest.getSize());

	}
	/**
	 * enlever un element situe a une positon  existante dans la liste
	 */

	@Test 
	public void  removeAtValidPositionTest(){
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest);

		//remove second item
		toTest.removeAt(1);
		assertEquals("Apres un retrait dans une liste de taille 2 ,la taille de liste  doit etre 1 ",1,toTest.getSize());


	}
	/***
	 * enlever un element situer a une position invalide(soit -1 ou superieur a la taille de la file)
	 * The test case must throw an exception
	 */
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void  removeAtInvalidPositionTest(){
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest);

		//remove item  at invalid position (e.g 10) 
		toTest.removeAt(10);
	}
	/***
	 * enlever un item qui existe dans une liste 
	 */
	@Test
	public void removeExistingItemTest(){
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		//enleve le premier ensemble de la liste
		toTest.removeItem(ensembleTest);
		assertEquals("Apres un retrait dans une liste de taille 2 ,la taille de liste  doit etre 1 ",1,toTest.getSize());


	}
	/***
	 * enlever un item qui n'existe pas dans une liste
	 * The function must throw a null pointer exception
	 */
	@Test(expected=NullPointerException.class)
	public void removeNonExistingItemTest(){
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);
		ArrayList<Object> fakeEnsemble = new ArrayList<Object>(Arrays.asList(12,67));

		//enleve le premier ensemble de la liste
		toTest.removeItem(fakeEnsemble);

	}
	/***
	 * enlever un element situer a une position valide dans la liste
	 */
	@Test
	public void setAtValidPositionTest(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		ArrayList<Object> newEnsemble = new ArrayList<Object>(Arrays.asList(12,67));
		//set ensemble at position 2 
		toTest.setAt(newEnsemble, 1);
		assertTrue("Apres modification, lensembles ajouter et celui dans la liste doivent etre les memesm"
				+ " ",toTest.getAt(1).equals(newEnsemble));

	}

	/***
	 * enlever un element situer a une position invalide dans la liste
	 */
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void setAtInvalidPositionTest() {
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		ArrayList<Object> newEnsemble = new ArrayList<Object>(Arrays.asList(12,67));
		//set ensemble at inexesting position 90 par e.g
		toTest.setAt(newEnsemble, 90);
	}

	/***
	 * recuperer un element situer a une position valide dans la liste
	 */
	@Test
	public void getAtValidPositionTest(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);
	    
		ArrayList<Object> givenArray = toTest.getAt(1);
		assertTrue("l<ojbet a la position doit etre l'ensemble 1 ",givenArray.equals(ensembleTest1));
		
	}

	/***
	 * recuperer un element situer a une position invalide dans la liste
	 */
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void getAtInvalidPositionTest() {
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);
	    //try to get item at invalid position 900 par exemple
		toTest.getAt(90);
	}

	/***
	 * tester la recuperation de  la taille d'une liste remplie
	 */
	@Test
	public void  getSizeTest(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		//la taille doit etre 2 
		assertEquals("la taille de la liste doit etre 2 ",2,toTest.getSize());
	}

	/***
	 * tester la recuperation de  la taille d'une liste qui est vide
	 */
	@Test
	public void  getEmptyListSizeTest(){
		MyList toTest = new MyListImpl();	

		//la taille doit etre 2 
		assertEquals("la taille de la liste doit etre 0 ",0,toTest.getSize());
	}

	/**
	 * test de la restauration d'une liste a son etat initial
	 * The list must be empty after reset(size =0 ) 
	 */
	@Test
	public void  resetTest(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		//la taille doit etre -1 apres le clear
		toTest.reset();
		assertEquals("la liste doi etre nulle (de taille 0)",0,toTest.getSize());
	}

	/***
	 * check whenever 2 myList object  content are the same 
	 */
	public boolean isMyListAreEquals(MyList first,MyList second){

		//The given lists must have the same size
		if(first.getSize() == second.getSize()){
			for (int i = 0; i < first.getSize(); i++) {
				if(!first.getAt(i).equals(second.getAt(i)))
					return false;
			}
		}else
			return false;

		return true ;
	}
	
	
	//Ici on commence les test Boite Blanche
	/**
	 * union test pour couvrir le setCalculatorImpl 
	 * LA branche else de cette condition  if(!setA.contains(a)) est pas couverte
	 * @throws IOException 
	 */
	@Test
	public void  union01_WhiteBox() throws IOException{
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(4,1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(1,3));
		
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(4,1,3));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Val2 contient une valeur de Val1, resultat =  [4,1,3]]",isMyListAreEquals(exceptedResult,toTest));
	}
	

	/**
	 * union test pour couvrir le removeAt
	 * LA branche else de cette condition  if(!setA.contains(a)) est pas couverte
	 * @throws IOException 
	 */
	@Test
	public void  removeAt01_WhiteBox() throws IOException{
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);

		//remove second item
		toTest.removeAt(0);
		System.out.println("size:"+toTest.getSize());
		assertEquals("Apres un retrait dans une liste de taille 2 ,la taille de liste  doit etre 1 ",0,toTest.getSize());
	}
	
	/**
	 * union test pour couvrir le removeAt
	 * LA branche else de cette condition  if(!setA.contains(a)) est pas couverte
	 * @throws IOException 
	 */
	@Test
	public void  removeAt02_WhiteBox() throws IOException{
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(84,-1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(81,-3));
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest);
		toTest.add(val1);
		toTest.add(val2);
		//remove second item
		toTest.removeAt(2);
		assertEquals("Apres un retrait dans une liste de taille 4  ,la taille de liste  doit etre 3 ",3,toTest.getSize());
	}
	
	/**
	 * remove un item dans une liste vide
	 * LA branche else de cette condition  if(!setA.contains(a)) est pas couverte
	 * @throws IOException 
	 */
	@Test(expected=NullPointerException.class)
	public void  removeItem01_WhiteBox() throws IOException{
		//create list and add some fake data
		MyList toTest = new MyListImpl();	

		//remove  item qui nexiste pas dans une liste vide
 	    toTest.removeItem(ensembleTest);
	}
	/**
	 * supprimer une liste avec une plus grande taille pour iterer le plus possible dans le while
	 * LA branche else de cette condition  if(!setA.contains(a)) est pas couverte
	 * @throws IOException 
	 */
	@Test
	public void  removeItem02_WhiteBox() throws IOException{
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(84,-1));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(81,-3));
		
		//create list and add some fake data
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);
		toTest.add(val1);
		toTest.add(val2);

		//remove  item qui nexiste pas dans une liste vide
 		toTest.removeItem(val1);
		assertEquals("Apres un retrait dans une liste de taille 2 ,la taille de liste  doit etre 1 ",3,toTest.getSize());
	}

}
