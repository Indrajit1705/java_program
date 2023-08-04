public class Largestnumber {
    public static int Largestnum(int num[]){

        int largest = num[0];
    
        for(int i = 1 ; i<num.length ; i++){
           if(num[i]>largest){
            largest= num[i];
           }
           
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        int findlargest = Largestnum(num);
        System.out.println("largest is "+findlargest);
    }
}
