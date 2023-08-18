package ArrayList;
import java.util.*;
public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        System.out.println(list);       //original arraylist
       Collections.sort(list);
       System.out.println(list);        //after sorting ascending order

       // descending order
       Collections.sort(list , Collections.reverseOrder());
       System.out.println(list);

    }
}
