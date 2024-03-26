package algoexpert;
import java.util.*;
public class TwoNumberSum {
    //Method takes array of numbers and target sum.
    //Return array of two numbers who makes target sum else return empty array.
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i=0;i<=array.length-1;i++){
            for(int j=i+1;j<=array.length-1;j++){
                if(array[i]+array[j]==targetSum) {
                    System.out.println(" Result: "+array[i]+" "+array[j]);
                    return new int[]{array[i],array[j]};
                }
            }
        }
        return new int[0];
    }
}
