package liste;

import java.util.ArrayList;

public class MaListe implements Liste {

	private ArrayList<ArrayList<Integer>> liste_;

	public MaListe(ArrayList<Integer> liste1, ArrayList<Integer> liste2, ArrayList<Integer> liste3){
		System.out.println("ama liste constructor");
		liste_ = new ArrayList<ArrayList<Integer>>();
		liste_.add(liste1);
		liste_.add(liste2);
		liste_.add(liste3);
	}
	/**
	 * 
	 */
	public void print(){
		for (ArrayList<Integer> arrayList : liste_) {
			System.out.println(arrayList);
		}
	}

	@Override
	public void add(ArrayList<Integer> ensemble) {
		liste_.add(ensemble);

	}

	@Override
	public void removeAt(int position) {
		liste_.remove(position);

	}

	@Override
	public void removeItem(ArrayList<Integer> ensemble) {
		liste_.removeAll(ensemble);

	}

	@Override
	public void setAt(ArrayList<Integer> ensemble, int position) {
		liste_.set(position, ensemble);

	}

	@Override
	public ArrayList<Integer> getAt(int position) {
		return liste_.get(position);
	}

	@Override
	public int getSize() {
		return liste_.size();
	}

	@Override
	public void reset() {
		liste_.clear();
	}

}
