package edu;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array=new int[]{-5,-1,3,6,7,9};
        for (int i=0;i<array.length;i++) {
            array[i]=array[i]*array[i];
        }
        for (int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                int temp;
                temp=array[i-1];
                array[i-1]=array[i];
                array[i]=temp;
            }
        }
        for (int x:array
             ) {
            System.out.println(x);
        }

    }
}
