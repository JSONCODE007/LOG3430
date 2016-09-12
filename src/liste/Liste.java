package liste;

import java.util.ArrayList;

public interface Liste {
	
	
	public void add(ArrayList<Integer> ensemble); 
	public void removeAt(int position);
	public void removeItem(ArrayList<Integer> ensemble); 
	public void setAt(ArrayList<Integer> ensemble, int position);
	public ArrayList<Integer> getAt(int position);
	public int getSize();
	public void reset();

}
