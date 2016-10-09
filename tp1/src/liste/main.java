package liste;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws Exception {

		// quick test 
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		
		liste1.add(1);
		liste1.add(2);
		
		liste2.add(2);
		liste2.add(3);
		
		//execution d'une union 
		 SuiteChainee chaineTest = new SuiteChainee("union", liste1, liste2);
		chaineTest.get().print();

	}

}
