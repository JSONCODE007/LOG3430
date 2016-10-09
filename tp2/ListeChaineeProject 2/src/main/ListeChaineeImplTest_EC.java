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

public class ListeChaineeImplTest_EC {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("yolo");
	}

	@After
	public void tearDown() throws Exception {
	}

	/***
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
	 * 
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
	 * invalid operation test case 
	 */
	@Test
	public void invalidOpTest() throws IOException{
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(1,2));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(1,3));
		//given values for test proposal
		ListeChainee suiteChainee= new ListeChaineeImpl();
		MyList toTest = suiteChainee.build("invalid", val1, val2);
		fail("Specied Operation not supported");
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

}
