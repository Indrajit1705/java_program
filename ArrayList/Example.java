package ArrayList;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation
        list.add(1);
        list.add(2);
        list.add(3);                    //time_complexity = O(1)
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        // add element in index
        list.add(1 , 10);
        System.out.println(list);

        //get element
        int element = list.get(2);          //time_complexity = O(1)
        System.out.println(element);
        
        //Remove element(delete)
        list.remove(2);
        System.out.println(list);                   //time_complexity = O(n)

        // set element at index
        list.set(2,10);                 //time_complexity = O(n)
        System.out.println(list);

        //contains element
        System.out.println(list.contains(1));           //time_complexity = O(n)
        System.out.println(list.contains(11));

        //size of ArrayList
        System.out.println(list.size());
        //print the arrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
