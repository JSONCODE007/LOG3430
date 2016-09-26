package liste;

import java.util.ArrayList;

public class Chaine implements IChaine {
    
	private ArrayList<ArrayList<Integer>> chaine_;

	public Chaine(ArrayList<Integer> liste1, ArrayList<Integer> liste2, ArrayList<Integer> liste3){
		//ajouter initialement les 3 listes a la chaine
		chaine_ = new ArrayList<ArrayList<Integer>>();
		chaine_.add(liste1);
		chaine_.add(liste2);
		chaine_.add(liste3);
	}
	
	/**
	 * afficher tous les ensembles dans la liste
	 */
	public void print(){
		int i = 0;
		for (ArrayList<Integer> arrayList : chaine_) {
			System.out.print(arrayList);
			//Pour afficher tous les ensembles sur une meme ligne et separees par une virgule
			if(i<chaine_.size()-1){
				System.out.print(",");
			}
			i++;
		}
		System.out.print("\n");
	}

	@Override
	public void add(ArrayList<Integer> ensemble) {
		chaine_.add(ensemble);
	}

	@Override
	public void removeAt(int position) {
		chaine_.remove(position);

	}

	@Override
	public void removeItem(ArrayList<Integer> ensemble) {
		//liste_.removeAll(ensemble);
		chaine_.remove(ensemble);

	}

	@Override
	public void setAt(ArrayList<Integer> ensemble, int position) {
		chaine_.set(position, ensemble);

	}

	@Override
	public ArrayList<Integer> getAt(int position) {
		return chaine_.get(position);
	}

	@Override
	public int getSize() {
		return chaine_.size();
	}

	@Override
	public void reset() {
		chaine_.clear();
	}

}
