package edu.arrayPractice;

public class ArrayCallMethod {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,2,5};
        int total=sum(nums);
        System.out.println("Total returned to calling method: "+total);
    }
    public static int sum(int[] nums){
        int total=0;
        for (int x:nums) {
            total=total+x;
        }
        return total;
        //System.out.println("Sum of all array numbers: "+total);
    }
}
