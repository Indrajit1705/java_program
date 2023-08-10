public class Secrowsum {
    public static int secondrowsum(int nums[][]){
        int sum = 0;
        if(nums.length >= 2){
            for (int j = 0; j < nums[1].length; j++) {
                sum += nums[1][j];
            }
        }
       
        return sum;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(secondrowsum(nums));
    }
}
