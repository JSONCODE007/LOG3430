package liste;

import java.util.ArrayList;

public interface  IChaine{
	
	/***
	 * ajouter un ensemble a la chaine
	 * @param ensemble
	 */
	public void add(ArrayList<Integer> ensemble); 
	/***
	 * enlever un ensemble situe a une position x dans la chaine
	 * @param position
	 */
	public void removeAt(int position);
	/**
	 * effacer un ensemble contenu dans la chaine
	 * @param ensemble
	 */
	public void removeItem(ArrayList<Integer> ensemble); 
	/**
	 * modifier un ensemble situer a une position x dans la chaine
	 * @param ensemble
	 * @param position
	 */
	public void setAt(ArrayList<Integer> ensemble, int position);
	/***
	 * recuperer un ensemble situé a une position x dans la chaine
	 * @param position
	 * @return
	 */
	public ArrayList<Integer> getAt(int position);
	/***
	 * recuperer le nombre d'ensemble dans la liste
	 * @return
	 */
	public int getSize();
	/***
	 * remettre la liste a zero;(effacer le contenu de la liste)
	 */
	public void reset();

}
