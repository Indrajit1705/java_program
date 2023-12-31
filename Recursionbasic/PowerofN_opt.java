package Recursionbasic;

public class PowerofN_opt {
    public static int optimizedpower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
        int halfPowerSq =  halfpower * halfpower;

        //n is odd                                                          // T.C = O(logn)
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizedpower(a, n));
    }
}
