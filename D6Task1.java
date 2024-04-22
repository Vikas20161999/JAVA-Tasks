package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class D6Task1 {
	
	 public static void remove(List<Integer> list) {
	        Iterator<Integer> iterator = list.iterator();
	        boolean removeNext = false;

	        while (iterator.hasNext()) {
	            iterator.next();
	            if (removeNext) {
	                iterator.remove();
	            }
	            removeNext = !removeNext;
	        }

	        System.out.println("After removing second element:");
	        System.out.println(list);
	    }

	    public static void main(String[] args) {
	        List<Integer> myList = new ArrayList<>(Arrays.asList(9,3,6,7,5,3,2,5,7,3,2,5,6));
	        remove(myList);
	    }

}
