package liste;

import java.util.ArrayList;


public class SuiteChainee {

	private Chaine maListe_;

	public SuiteChainee(String operation, ArrayList<Integer> liste1, ArrayList<Integer> liste2) throws Exception{
		
		ArrayList<Integer> operationResult = new ArrayList<Integer>();

		switch (operation) {
		case "union": 
			operationResult = union(liste1, liste2);
			break;
		case "intersection":
			operationResult= intersection(liste1, liste2);
			break;
		case "difference":
			operationResult= difference(liste1, liste2);
			break;
		case "symmetric difference":
			operationResult = symmetricDifference(liste1, liste2);
			break;
		case "is subset":
			operationResult = isSubset(liste1, liste2);
			break;
		case "is superset":
			operationResult = isSuperset(liste1, liste2);
			break;
		default :
			throw new Exception("Cette operation n'est pas supporté !"); 

		}
		
		//instantier la nouvelle liste qui contient les ensembles
		maListe_ = new Chaine(liste1,liste2,operationResult);
	}

	/***
	 * performer l'union de deux ensembles
	 * @param liste1
	 * @param liste2
	 * @return tous les elements distincts des 2 listes
	 */
	private ArrayList<Integer> union(ArrayList<Integer> liste1, ArrayList<Integer> liste2){

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//ajouter les elements de la premieres liste a l'ensemble
		for (Integer item : liste1) {
			if(!result.contains(item)){
				result.add(item);
			}
		}
		//ajouter les elements de la seconde liste a l'ensemble
		for (Integer item : liste2) {
			if(!result.contains(item)){
				result.add(item);
			}
		}
		return result;
	}
	/***
	 * performer  
	 * @param liste1
	 * @param liste2
	 * @return
	 */
	private ArrayList<Integer>  intersection(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i< liste1.size();i++){
			for(int j=0;j< liste2.size();j++){
				if(liste1.get(i) == liste2.get(j) ){
					if(!result.contains(liste1.get(i)))
						result.add(liste1.get(i));
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Tous les elements de liste1 qui se sont pas dans liste 2
	 * @param liste1
	 * @param liste2
	 * @return
	 */
	private ArrayList<Integer>  difference(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i< liste1.size(); i++){
			boolean isInListe2  = false;
			for(int j =0;j<liste2.size();j++){
				if(liste1.get(i) == liste2.get(j)){
					isInListe2 = true;
					break;
				}
			}
			if(!isInListe2)
				result.add(liste1.get(i));
		}

		return result;
	}

	/**
	 *  A delta B = (A union B ) difference (A inter B)
	 *  source: https://fr.wikipedia.org/wiki/Alg%C3%A8bre_des_parties_d%27un_ensemble
	 * @param liste1
	 * @param liste2
	 */
	private ArrayList<Integer>  symmetricDifference(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		//faire A union B
		ArrayList<Integer> union = this.union(liste1, liste2);
		//faire A inter B
		ArrayList<Integer> intersection =this.intersection(liste1, liste2);
		//le resultat est la difference de union et intersection 
		ArrayList<Integer> result =  this.difference(union,intersection);
		return  result;

	}
	/***
	 * Verifier que liste1 est inclus dans liste2 et retourner {1} si oui ,sinon {0}
	 * @param liste1
	 * @param liste2
	 */

	private ArrayList<Integer>  isSubset(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		//remvove all duplicates items in listes
		liste1 = Utils.removeDuplicates(liste1);
		liste2 = Utils.removeDuplicates(liste2);
		
		ArrayList<Integer> result =  new ArrayList<Integer>();
		int nbFoundedItems = 0;
		for (Integer  item1: liste1) {
			for (Integer item2 : liste2) {
				if(item1 == item2){
                    nbFoundedItems++;
				}
			}
		}
		if(nbFoundedItems == liste1.size())
			result.add(1);
		else
			result.add(0);
		
		return  result;

	}
	/**
	 *  liste 1 contient tous les elements de liste2 ou 
	 *tous les elements de liste2 sont dans liste1
	 * @param liste1
	 * @param liste2
	 * @return
	 */
	private ArrayList<Integer> isSuperset(ArrayList<Integer> liste1, ArrayList<Integer> liste2) {
		//remvove all duplicates items in 
		liste1 = Utils.removeDuplicates(liste1);
		liste2 = Utils.removeDuplicates(liste2);
		ArrayList<Integer> result =  new ArrayList<Integer>();
		int nbFoundedItems = 0;
		for (Integer  item2: liste2) {
			for (Integer item1 : liste1) {
				if(item1 == item2){
                    nbFoundedItems++;
				}
			}
		}
		if(nbFoundedItems == liste2.size())
			result.add(1);
		else
			result.add(0);
		
		return  result;
     
	}

	public Chaine get(){
		return maListe_;
	}
}
