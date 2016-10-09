/**
 * 
 */
package main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author thierno
 *
 */
public class MyListImplTest {


	ArrayList<Object> ensembleTest = new ArrayList<Object>(Arrays.asList(4,1));
	ArrayList<Object> ensembleTest1 = new ArrayList<Object>(Arrays.asList(12,67));
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

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

		//remove item  at invalid position (e.g -1) 
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
	public void setAtValidPosition(){
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
	public void setAtInvalidPosition() {
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
	public void getAtValidPosition(){
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
	public void getAtInvalidPosition() {
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);
	    //try to get item at invalid position 900 par exemple
		toTest.getAt(90);
	}

	/***
	 * tester la recuperation de  la taille d'une liste
	 */
	@Test
	public void  getSize(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		//la taille doit etre 2 
		assertEquals("la taille de la liste doit etre 2 ",2,toTest.getSize());
	}

	/**
	 * test de la restauration d'une liste a son etat initial
	 * The list must be empty after reset(size =0 ) 
	 */
	@Test
	public void  reset(){
		MyList toTest = new MyListImpl();	
		toTest.add(ensembleTest);
		toTest.add(ensembleTest1);

		//la taille doit etre -1 apres le clear
		toTest.reset();
		assertEquals("la liste doi etre nulle (de taille 0)",0,toTest.getSize());
	}


}

