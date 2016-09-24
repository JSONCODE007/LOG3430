package liste;

import java.util.ArrayList;

public interface Liste {
	
	/***
	 *
	 * @param ensemble
	 */
	public void add(ArrayList<Integer> ensemble); 
	/***
	 * 
	 * @param position
	 */
	public void removeAt(int position);
	/**
	 * 
	 * @param ensemble
	 */
	public void removeItem(ArrayList<Integer> ensemble); 
	/**
	 * 
	 * @param ensemble
	 * @param position
	 */
	public void setAt(ArrayList<Integer> ensemble, int position);
	/***
	 * 
	 * @param position
	 * @return
	 */
	public ArrayList<Integer> getAt(int position);
	/***
	 * 
	 * @return
	 */
	public int getSize();
	/***
	 * 
	 */
	public void reset();

}
