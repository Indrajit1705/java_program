package Recursionbasic;

public class Natrualnumbersum {
    public  static int naturalnum(int n){
        int sum = 0;
        if(n == 1){
            return 1;
        }
        int prev = naturalnum(n-1);
         sum = n+prev;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(naturalnum(n));
    }
}
