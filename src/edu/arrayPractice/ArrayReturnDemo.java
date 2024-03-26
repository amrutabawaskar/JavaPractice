package edu.arrayPractice;

public class ArrayReturnDemo {
    public static void main(String[] args) {
        int[] x={1,4,6,3,2,8};
        int[] y=reverse(x);
        for (int i:y) {
            System.out.println(i);
        }
    }
    //Pass array as argument to method and return array object.
    public static int[] reverse(int[] x){

        System.out.println("In reverse");
        int[] y=new int[x.length];
        int j=0;
        for (int i=(x.length-1);i>=0;i--) {
            y[j]=x[i];
            j++;
        }
        return y;
    }
}
