
//GFG problem 1
// Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

// Example 1:

// Input: 
// n = 2
// Output: 
// 1 
// Explanation: 
// 1 is the 2nd number of fibonacci series.


public class NthFibonacchinumber {

        static int nthFibonacci(int n){
            // code here
           if(n == 0){
               return 0;
           }
           if(n == 1){
               return 1;
           }
           int n1 = 0 , n2=1;
           int sum = 0;
           for(int i = 2; i <= n; i++ ){
               sum = (n1+n2) % 1000000007;
               n1 = n2 % 1000000007;
               n2 = sum;
           }
           return sum;
            
        }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(3));

    }
}
