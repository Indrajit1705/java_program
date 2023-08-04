public class Printsubarray {
    public static void subarray(int num[]){
        for (int i = 0; i < num.length; i++) {              //start = i
            for (int j = i; j < num.length; j++) {         // end = j
                for (int k = i; k <= j; k++) {               //print
                    System.out.print(num[k]+" ");           //subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12};
        subarray(num);

    }
}
