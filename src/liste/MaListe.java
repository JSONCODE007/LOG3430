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
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAt(int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeItem(ArrayList<Integer> ensemble) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAt(ArrayList<Integer> ensemble, int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Integer> getAt(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}
