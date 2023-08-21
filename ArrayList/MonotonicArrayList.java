package ArrayList;
import java.util.*;
public class MonotonicArrayList {
    public static boolean monotonic(ArrayList<Integer> nums,int n){
         n = nums.size()-1;
        // for(int i  = 0; i < n;i++){
        //     for(int j = i+1 ; j < n ; j++){
        //         if(nums.get(i) <= nums.get(j) && nums.get(i)>= nums.get(j)){        //brute force approach
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //optimal solution
        boolean inc = true;
        boolean desc =  true;
        for(int i = 0 ; i< n ; i++){
            if(nums.get(i) > nums.get(i+1)){
                inc = false;
            }
            if(nums.get(i) < nums.get(i+1)){
                desc = false;
            }
        }
        return inc || desc;

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(5);
        nums.add(9);
        int n = 4;
        System.out.println(monotonic(nums, n));


    }
    
}
