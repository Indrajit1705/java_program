package ArrayList;
import java.util.*;
public class MostFrequent {
    public static int mostfreq(ArrayList<Integer> nums, int key){
        int result[] = new int[10000];
        for (int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0 ;i<1000;i++){
            if(result[i]>max){
                max =result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        System.out.println("The value is "+mostfreq(nums, key));

    }

}
