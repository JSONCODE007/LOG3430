package liste;

import java.util.ArrayList;

public class seedmain {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		SuiteChainee chaineTest;

		System.out.println("TP1 de LOG3430 \n");

		//Exemple 1
		System.out.println("---------------------Test des creation d\'une suite selon l'operation----------------------------------");
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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(union, liste1, liste2)" + "\n" + "=> ");
		//execution de l'union
		chaineTest = new SuiteChainee("union", liste1, liste2);
		chaineTest.get().print();

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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(intersection, liste1, liste2)" + "\n" + "=> ");
		//execution de la intersection
		chaineTest = new SuiteChainee("intersection", liste1, liste2);
		chaineTest.get().print();

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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(difference, liste1, liste2)" + "\n" + "=> ");
		//execution de la difference
		chaineTest = new SuiteChainee("difference", liste1, liste2);
		chaineTest.get().print();

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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(symmetric difference, liste1, liste2)" + "\n" + "=> ");
		//execution de la symmetric difference
		chaineTest = new SuiteChainee("symmetric difference", liste1, liste2);
		chaineTest.get().print();

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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(is subset, liste1, liste2)" + "\n" + "=> ");
		//execution de is subset
		chaineTest = new SuiteChainee("is subset", liste1, liste2);
		chaineTest.get().print();

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

		System.out.print("Resultat obtenu apr�s l'ex�cution de l'instruction suivante: SuiteChainee(is superset, liste1, liste2)" + "\n" + "=> ");
		//execution de is superset
		chaineTest = new SuiteChainee("is superset", liste1, liste2);
		chaineTest.get().print();

		System.out.println("-------------------Fin------------------------------------------");
		System.out.println();
		System.out.println("-------------------Tests des methodes de gestion------------------------");
		System.out.println("Construction d'un suite chainee de test");
		ArrayList<Integer> liste3= new ArrayList<Integer>();
		liste3.add(89);
		liste3.add(85);
		ArrayList<Integer> liste4= new ArrayList<Integer>();
		liste4.add(90);
		liste4.add(92);
		ArrayList<Integer> liste5= new ArrayList<Integer>();
		liste5.add(45);
		ArrayList<Integer> liste6= new ArrayList<Integer>();
		liste6.add(13);
		
		chaineTest = new SuiteChainee("union", liste1, liste2);
		chaineTest.get().print();
		
		System.out.println("execution 4 fois de la fonction add(ensemble)");
		chaineTest.get().add(liste3);
		chaineTest.get().add(liste4);
		chaineTest.get().add(liste5);
		chaineTest.get().add(liste6);
		chaineTest.get().print();
		
		System.out.println("execution de  removeAt(3)");
		chaineTest.get().removeAt(3);
		chaineTest.get().print();
		
		System.out.println("execution de removeItem(ensemble) --on efface le dernier ensemble ");
		chaineTest.get().removeItem(liste6);
		chaineTest.get().print();
		
		System.out.println("execution de setAt(ensemble,position)-on remplace le premier ensemble");
		chaineTest.get().setAt(liste6,0);
		chaineTest.get().print();
		
		System.out.println("execution de getAt(1)--recuper l'ensemble a la position  1");
		System.out.println(chaineTest.get().getAt(1));
		
		
		System.out.println("execution de getSize()--recupere le nombre d'ensemble dans la chaine");
		System.out.println(chaineTest.get().getSize());
		
		System.out.println("execution de reset()---vider la suite chainee");
		chaineTest.get().reset();
		
		System.out.println("taille apres vidage "+ chaineTest.get().getSize());
		
		
		System.out.println("-------------------Fin------------------------------------------");
		System.out.println();


	}

}
