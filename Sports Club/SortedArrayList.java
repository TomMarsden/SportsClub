import java.util.ArrayList;
/**
 * 
 */
public class SortedArrayList<E extends Comparable<E>> extends ArrayList<E>
{
    public void sortAdd(E x){
        // for loop uses the predefined function compareTo to sort given array.
        for(int i = 0; i < this.size(); i++){
            // if the comparison returns a negative number, then the new entry under comparison is entered at the current position.
            if(this.get(i).compareTo(x) >= 0){
                this.add(i,x);
                return;
            }
        }
        // if the for loop has sorted through every position, add to the end of the array.
        this.add(x);
    }
}
