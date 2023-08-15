package Recursionbasic;

public class ArraysortedorNot {
    public static boolean issorted(int arr[] , int n){
       
        if(n == arr.length-1){
            return true;
        }
       
        if(arr[n] > arr[n+1]){
            return false;
        }
        return issorted(arr, n+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(issorted(arr, 0));
    }
}
