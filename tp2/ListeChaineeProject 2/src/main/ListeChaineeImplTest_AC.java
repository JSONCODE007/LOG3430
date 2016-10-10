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

		assertTrue("Resultat de l'union doit etre [[7,8,8], [5,9,10,8], [7,8,8,5,9,10]]",isMyListAreEquals(exceptedResult,toTest));

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

		assertTrue("Resultat de l'union doit etre [[7,8], [5,9,10,4,8,4], [7,8,8,5,9,10,4,4]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[2,3], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[], [3,4], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,0,9));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4,9,11,5));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList(5,9));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[5,6,0,9], [3,4,9,11,5], [5,9]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[5,6,6], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[], [5,8,8], []]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList(8));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[7,8], [5,8,8], [8]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList(8,8));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[7,8,8], [5,9,10,8], [8,8]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  intersection operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void intersectionOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,4));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4));
		ArrayList<Object> intersectionVal1Val2 = new ArrayList<Object>(Arrays.asList(8,8,10,4));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("intersection", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(intersectionVal1Val2);

		assertTrue("Resultat de l'intersection doit etre [[7,8,8,10,4], [5,9,10,4,8,4], [8,8,10,4]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(2,3));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[2,3], [], [2,3]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[], [3,4], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,0,9));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4,9,11,5));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(6,0));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[5,6,0,9], [3,4,9,11,5], [6,0]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(5,6,6));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[5,6,6], [], [5,6,6]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[], [5,8,8], []]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[7,8], [5,8,8], [7]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[7,8,8], [5,9,10,8], [7]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  difference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void differenceOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,4));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4));
		ArrayList<Object> differenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("difference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(differenceVal1Val2);

		assertTrue("Resultat de la difference doit etre [[7,8,8,10,4], [5,9,10,4,8,4], [7]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList());

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[], [], []]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(2,3));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[2,3], [], [2,3]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(3,4));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[], [3,4], [3,4]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,0,9));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4,9,11,5));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(6,0,3,4,11));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[5,6,0,9], [3,4,9,11,5], [6,0,3,4,11]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(5,6,6));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[5,6,6], [], [5,6,6]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(5,8,8));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[], [5,8,8], [5,8,8]]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7,5));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[7,8], [5,8,8], [7,5]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7,5,9,10));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[7,8,8], [5,9,10,8], [7,5,9,10]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  symDifference operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void symDifferenceOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,4));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4));
		ArrayList<Object> symDifferenceVal1Val2 = new ArrayList<Object>(Arrays.asList(7,5,9));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("symDifference", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(symDifferenceVal1Val2);

		assertTrue("Resultat de la difference symetrique doit etre [[7,8,8,10,4], [5,9,10,4,8,4], [7,5,9]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[], [], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[2,3], [], [false]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[], [3,4], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,0,9));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(0,3,4,9,11,5,6));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[5,6,0,9], [0,3,4,9,11,5,6], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[5,6,6], [], [false]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[], [5,8,8], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(7,5,8,8));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[7,8], [7,5,8,8], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8,7));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[7,8,8], [5,9,10,8,7], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSubset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSubsetOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,4));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4,7));
		ArrayList<Object> isSubsetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSubset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSubsetVal1Val2);

		assertTrue("Resultat de is subset doit etre [[7,8,8,10,4], [5,9,10,4,8,4,7], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest1() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[], [], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest2() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(2,3));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[2,3], [], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest3() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(3,4));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[], [3,4], [false]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest4() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,0,9));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(0,9,6));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[5,6,0,9], [0,9,6], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest5() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(5,6,6));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[5,6,6], [], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest6() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList());
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,8,8));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[], [5,8,8], [false]]",isMyListAreEquals(exceptedResult,toTest));

	}


	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide 
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest7() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,10,13,12,5));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(7,5,8,8));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[7,8,10,13,12,5], [7,5,8,8], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest8() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,9,5,11));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,8,7));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("true"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[7,8,8,10,9,5,11], [5,9,10,8,7], [true]]",isMyListAreEquals(exceptedResult,toTest));

	}
	
	/***
	 *  isSuperset operation test case
	 *  val1 est un ensemble non-vide avec doublons
	 *  val2 ensemble non-vide avec doublons
	 * @throws IOException 
	 */
	@Test
	public void isSupersetOpTest9() throws IOException {

		//initiate values
		ArrayList<Object> val1 = new ArrayList<Object>(Arrays.asList(7,8,8,10,4));
		ArrayList<Object> val2 = new ArrayList<Object>(Arrays.asList(5,9,10,4,8,4,7));
		ArrayList<Object> isSupersetVal1Val2 = new ArrayList<Object>(Arrays.asList("false"));

		//given values for test proposal
		MyList toTest = new MyListImpl();	
		ListeChainee suiteChainee= new ListeChaineeImpl();
		toTest = suiteChainee.build("isSuperset", val1, val2);

		//excepted result 
		MyList exceptedResult = new MyListImpl();	
		exceptedResult.add(val1);
		exceptedResult.add(val2);
		exceptedResult.add(isSupersetVal1Val2);

		assertTrue("Resultat de is superset doit etre [[7,8,8,10,4], [5,9,10,4,8,4,7], [false]]",isMyListAreEquals(exceptedResult,toTest));

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
