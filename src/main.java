import java.util.ArrayList;

import liste.Chaine;
import liste.SuiteChainee;

public class main {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		SuiteChainee test_suite;
		
		System.out.println("TP1 de LOG3430 \n");
		
		//Exemple 1
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 1: Union \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		liste1.add(7);
		liste1.add(9);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(1);
		liste2.add(9);
		liste2.add(4);
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(union, liste1, liste2)" + "\n" + "=> ");
		//execution de l'union
		test_suite = new SuiteChainee("union", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");	
		
		//Exemple 2
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 2: Intersection \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		liste1.add(7);
		liste1.add(9);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(1);
		liste2.add(9);
		liste2.add(4);
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(intersection, liste1, liste2)" + "\n" + "=> ");
		//execution de la intersection
		test_suite = new SuiteChainee("intersection", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");	
		
		//Exemple 3
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 3: Difference \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		liste1.add(7);
		liste1.add(9);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(1);
		liste2.add(9);
		liste2.add(4);
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(difference, liste1, liste2)" + "\n" + "=> ");
		//execution de la difference
		test_suite = new SuiteChainee("difference", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");	
		
		//Exemple 4
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 4: Symmetric difference \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		liste1.add(7);
		liste1.add(9);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(1);
		liste2.add(9);
		liste2.add(4);
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(symmetric difference, liste1, liste2)" + "\n" + "=> ");
		//execution de la symmetric difference
		test_suite = new SuiteChainee("symmetric difference", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");
		
		//Exemple 5
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 5: is subset \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(1);
		liste2.add(9);
		liste2.add(4);
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		liste2.add(5);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(is subset, liste1, liste2)" + "\n" + "=> ");
		//execution de is subset
		test_suite = new SuiteChainee("is subset", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");
		
		//Exemple 6
		System.out.println("--------------------------------------------------------------");
		System.out.println("Exemple 6: is superset \n");
		
		//liste 1
		liste1.add(1);
		liste1.add(3);
		liste1.add(5);
		liste1.add(9);
		liste1.add(4);
		liste1.add(8);
		liste1.add(11);
		
		System.out.print("Liste 1:");
		System.out.println(" " + liste1);
		
		//liste 2
		liste2.add(8);
		liste2.add(3);
		liste2.add(11);
		liste2.add(5);
		
		
		System.out.print("Liste 2:");
		System.out.println(" " + liste2 + "\n");
		
		System.out.print("Resultat obtenu après l'exécution de l'instruction suivante: SuiteChainee(is superset, liste1, liste2)" + "\n" + "=> ");
		//execution de is superset
		test_suite = new SuiteChainee("is superset", liste1, liste2);
		test_suite.get().print();
		
		//liberer les listes
		liste1.clear();
		liste2.clear();
		System.out.println("--------------------------------------------------------------");
		
		}

}
