import java.util.ArrayList;

import liste.SuiteChainee;

public class main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("start the prog");
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		
		liste1.add(1);
		liste1.add(1);
		liste1.add(1);
		liste1.add(6);
		liste1.add(9);
		
		liste2.add(1);
		liste2.add(6);
		liste2.add(2);
		liste2.add(3);
		liste2.add(9);
		liste2.add(6);
		
		
       SuiteChainee test_suite = new SuiteChainee("union", liste1, liste2);
       
		System.out.println("end the prog");

       
	}

}
