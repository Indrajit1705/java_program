package ArrayList;
import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairsum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp<rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50 ;
        System.out.println(pairsum1(list, target));
    }
}
