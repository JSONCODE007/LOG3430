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

public class ListeChaineeImplECTest {
	


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
	 * union operation test case
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
		
		assertTrue("Union result",isMyListAreEquals(exceptedResult,toTest));
		
	}
	/***
	 * intersection operation test case
	 */
	@Test
	public void intersectionOpTest() {
		assertEquals("10 x 5 must be 50", 500, 10*5);
	}
	/**
	 * difference  operation  test case
	 */
	@Test
	public void differenceOpTest(){
		
	}
	/***
	 * symetric difference operation test case
	 */
	@Test
	public void symDifferenceOpTest(){
		
	}
	/***
	 * is subset operation test case
	 */
	@Test
	public void isSubserOpTest(){
		
	}
	/***
	 * is superset operation test case 
	 */
	@Test
	public void isSupersetOpTest(){
		
	}
	/**
	 * invalid operation test case 
	 */
	@Test
	public void invalidOpTest(){
		
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
