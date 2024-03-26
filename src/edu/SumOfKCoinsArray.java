package edu;

public class SumOfKCoinsArray {
    public static void main(String[] args) {
        int[] a=new int[]{5,4,6,1,7,3,2};
        int k=4,max_points=0;
        int current_points=0;
        int n=a.length;
        //If array length is equal to k.
        if(a.length==k){
            for (int x:a) {
                max_points=max_points+x;
            }
        }
        //find left k coins sum as current points.
        for (int i=0;i<k;i++){
            current_points=current_points+a[i];
        }
        //update max_point as current_point
        max_points=current_points;
        //j points to end of array
        int j=a.length-1;

        for(int i=k-1;i>=0;i--){
            current_points=current_points+a[j]-a[i];
            max_points=Math.max(current_points,max_points);
            j--;
        }
        System.out.println("Max sum : "+max_points);

        }
    }


