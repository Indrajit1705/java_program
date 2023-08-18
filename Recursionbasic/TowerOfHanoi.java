package Recursionbasic;

public class TowerOfHanoi {
    public static void towerofhanoi(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("Transfer disk" +n +" from " +source+" to " +destination);
        return;
        }
        //transfer top n-1 from source to helper using destination as 'helper'
        towerofhanoi(n-1, source, destination,helper); 
        //transfer nth from source to destination
        System.out.println("Transfer disk" +n +" from " +source+" to " +destination);
        // transfer n-1 from helper to dest using source as 'helper'
        towerofhanoi(n-1, helper,source, destination);
    }

public static void main(String[] args) {
    int n = 3;
    towerofhanoi(n,"A", "B", "C");
    }
}