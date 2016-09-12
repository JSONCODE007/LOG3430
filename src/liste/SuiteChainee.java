package liste;

import java.util.ArrayList;

public class SuiteChainee {

	private MaListe maListe_;
	
	public SuiteChainee(String operation, ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		switch (operation) {
			
			case "union": 
				
				union(liste1, liste2);
				
			break;
				
			case "intersection":
				
				intersection(liste1, liste2);
			
			break;
			
			case "difference":
				
				difference(liste1, liste2);
				
			break;
			
			case "symmetric difference":
				
				symmetricDifference(liste1, liste2);
				
			break;
			
			case "is subset":
				
				isSubset(liste1, liste2);
				
			break;
			
			case "is superset":
				
				isSuperset(liste1, liste2);
				
			break;
			
		
			default :
			
			
		}
		
		
	}
	
	private void union(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(liste1);
	
		for (Integer i : liste2) {
		
			for (Integer j : liste1) {
				
				if(i==j){
					break;
				}
				else{
				result.add(i);
				break;
				}
			}
		
		}
		maListe_ = new MaListe(liste1,liste2,result);
		
		for(int i = 0; i < result.size(); i++) {   
		    System.out.print(result.get(i));
		} 
		
		 
	}
	
	private void intersection(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		
		
		 
	}
	
	private void difference(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		
		
		 
	}
	
	private void symmetricDifference(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		
		
		 
	}
	
	private void isSubset(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		
		
		 
	}
	
	private void isSuperset(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
		
		
		
		 
	}
	
	
	
	public MaListe get(){
		return maListe_;
	}
}
