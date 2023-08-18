package Recursionbasic;

public class CountSubstrings {
    public static int countsubstring(String str, int si , int ei, int n){
        //base case
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        //work
        int res = countsubstring(str, si+1, ei, n-1)+countsubstring(str, si, ei-1, n-1) - countsubstring(str, si+1, ei-1, n-2);

        if(str.charAt(si) == str.charAt(ei)){
            res ++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "aba";
        int n  = str.length();
        System.out.println(countsubstring(str, 0, n-1, n));
    }
}
