public class Countnumber {
    public static int countnum(int array[][],int key){
        int count=0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println(countnum(matrix, 8));
    }
}
