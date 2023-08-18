package ArrayList;

import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(8);

        System.out.println("original ArrayList "+list);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if(max <  list.get(i)){
            //     max = list.get(i);                       // simple method
            // }

            max = Math.max(max , list.get(i));          // anoher method
        }
        System.out.println("max element "+ max);
    }
}
