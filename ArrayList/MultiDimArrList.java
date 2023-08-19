package ArrayList;
import java.util.*;

public class MultiDimArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5;i++){
            list1.add(i*1);     //1 2 3 4 5
            list2.add(i*2);     //2 4 6 8 10
            list3.add(i*3);     //3 6 9 12 15
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);



        System.out.println(mainlist);

        //nestedloop
        for(int i =0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j =0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }









        // ArrayList<Integer> list1 = new ArrayList<>();               // for list1
        // list1.add(1);
        // list1.add(2);
        // mainlist.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();               // for list2
        // list2.add(3);
        // list2.add(4);
        // mainlist.add(list2);

        // //print list    
        // for (int i = 0; i < mainlist.size(); i++) {
        //     ArrayList<Integer> currlist = mainlist.get(i);
        //     for (int j = 0; j < currlist.size(); j++) {
        //         System.out.print(currlist.get(j)+ " ");
                
        //     }
        //     System.out.println();           
        // }

        // System.out.println(mainlist);

    }
}
