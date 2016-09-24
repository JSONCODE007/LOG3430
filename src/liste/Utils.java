package liste;

import java.util.ArrayList;

public class Utils {

	
	/***
	 * removed duplicates items in array list
	 * @param liste
	 */
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> liste){
		ArrayList<Integer> result = new ArrayList<Integer>();
		//ajouter un element a la liste seulement sil nest pas deja present
		for (Integer item : liste) {
			if(!result.contains(item)){
				result.add(item);
			}
		}
		return result;
		}
}
