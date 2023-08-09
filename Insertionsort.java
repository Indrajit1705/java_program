public class Insertionsort {
    public static void insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            //finding out the correct pos to insert
            while(previous >= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current; 
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printArr(arr);
    }
}
