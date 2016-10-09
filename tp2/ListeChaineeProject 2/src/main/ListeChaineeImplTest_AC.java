/**
 * 
 */
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

/**
 * @author thierno
 *
 */
public class ListeChaineeImplTest_AC {

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

	/***
	 *  union operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(2,3));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[2,3], [], [2,3]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(3,4));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[], [3,4], [3,4]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(5,6,3,4));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[5,6], [3,4], [5,6,3,4]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(5,6,6));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[5,6,6], [], [5,6,6]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(5,8,8));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[], [5,8,8], [5,8,8]]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(7,8,5));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[7,8], [5,8,8], [7,8,5]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(7,8,8,5,9,10));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[7,8], [5,8,8], [7,8,5]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  union operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void unionOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4));
		ArrayList<Object> unionVal1Val2 = new ArrayList<Object>(Arrays.asList(7,8,8,5,9,10,4,4));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("union", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(unionVal1Val2);

		assertTrue("Resultat de l'union doit etre [[7,8], [5,8,8], [7,8,5]]",isMyListAreEquals(exceptedResult,toTest));

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
