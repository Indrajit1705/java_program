

public class Transposematrix {
    public static void transposematrix(int arr[][]){
        int transpose[][] = new int[3][3];
            System.out.println("original matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               System.out.print(+arr[i][j]+" ");                        //print original matrix
            }
            System.out.println();
        }
            System.out.println("Transpose matrix:");
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }                                                           //print transpose matrix
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        transposematrix(arr);                                             //function called
    }
}
