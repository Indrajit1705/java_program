package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static boolean pairsum(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size();i++){
            for(int j = i+1;j<list.size();j++){                                         //brute force approach
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target  = 10;
        //1,8,6,2,5,4,8,3,7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(pairsum(list, target));
    }
}
