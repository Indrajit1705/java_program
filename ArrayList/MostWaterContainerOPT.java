package ArrayList;

import java.util.ArrayList;

public class MostWaterContainerOPT {

    // 2 pointer approach
    public static int storewater(ArrayList<Integer> height){
        int maxwater = 0;
        int leftpointer = 0;
        int rightpointer = height.size()-1;

        while(leftpointer < rightpointer){
            // calculate water area
            int ht = Math.min(height.get(leftpointer) , height.get(rightpointer));      // TC = O(n)
            int width = rightpointer - leftpointer;
            int currwater = ht * width;
            maxwater = Math.max(maxwater,currwater);

            //update pointer
            if(height.get(leftpointer) < height.get(rightpointer)){
                leftpointer++;
            }
            else{
                rightpointer--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));

    }
}
