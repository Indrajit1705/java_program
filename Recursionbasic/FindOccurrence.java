package Recursionbasic;

public class FindOccurrence {
    public static void occurrence(int arr[], int key, int index){
        if(index ==  arr.length){
            return;
        }
        if(arr[index] == key){
            System.out.println(index+" ");
        }
        occurrence(arr, key, index+1);

    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        occurrence(arr, key, 0);
    }
}
