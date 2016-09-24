import java.util.ArrayList;

import liste.SuiteChainee;

public class main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("start the prog");
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		
		liste1.add(1);
		liste1.add(2);
		liste1.add(3);
	
		
		liste2.add(1);
		liste2.add(3);
	
		
		
       SuiteChainee test_suite = new SuiteChainee("is superset", liste1, liste2);
        test_suite.get().print();
		System.out.println("end the prog");

       
	}

}
