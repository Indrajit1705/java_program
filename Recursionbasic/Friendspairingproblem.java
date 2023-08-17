package Recursionbasic;

public class Friendspairingproblem {

    public static int friendspair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int single = friendspair(n-1);          //for single pair
        int pair = friendspair(n-2);            // for double pair  

        int totalways = single + (n-1) * pair;      // total no of ways
        
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendspair(3));
    }
}
