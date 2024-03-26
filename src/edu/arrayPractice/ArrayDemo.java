package edu.arrayPractice;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //Every array is created in heap.
        int[] x=new int[10];
        x[0]=32;
        x[1]=56;
        x[2]=94;
        x[3]=72;
        x[4]=9;
        //x.length
        int y[]={44,130,32,4085,1635,5,203};
        int len=y.length;
        for (int s:y) {
            System.out.println(s);
        }
        //Finding sum of all array elements.
        int sum=0;
        for (int s:y) {
            sum=sum+s;
        }
        System.out.println("Sum of all elements:"+sum);
        //searching an element.
        int findNum=5;
        for (int i=0;i<y.length;i++) {
            if(y[i]==findNum){
                System.out.println(findNum+" is present in array at :"+(i+1));
            }
        }
        //Find largest element in an array.
        int largest=0;
        for (int s:y) {
            if(s>largest){
                largest=s;
            }
        }
        System.out.println("Largest in array y: "+largest);
        //Find second largest element in an array.
        int secondLargest=0;
        int biggest=y[0];
       for (int i=1;i<y.length;i++){
            if(y[i]>biggest){
                secondLargest=biggest;
                biggest=y[i];
            }
            else if(y[i]>secondLargest){
                secondLargest=y[i];
            }
        }
        System.out.println("second largest in array y: "+secondLargest);

       //Rotation of an array to left/right.
        int temp=y[0];
        for (int i=1;i<y.length;i++){
            y[i-1]=y[i];
        }
        int lastEle=len-1;
        y[lastEle]=temp;
        System.out.println("Rotating y array left:");
        for (int i:y) {
            System.out.println(i);
        }
        //Insert an element at index 2 in array x.
        int index=2;
        int num=98434;
        System.out.println("Array x: ");
        for (int ele:x) {
            System.out.println(ele);
        }
        for (int i=x.length-1;i>index;i--){
            x[i]=x[i-1];
        }
        x[index]=num;
        System.out.println("After insertion at "+index);
        for (int ele:x) {
            System.out.println(ele);
        }
        //Delete an element at index=2
        System.out.println("Delete element at 2");
        index=2;
        for(int i=index;i<x.length;i++){
            x[i-1]=x[i];
        }
        for (int ele:x) {
            System.out.println(ele);
        }
        //increase size of array.
        int[] a={12,4,6};
        System.out.println("length of array a :"+a.length);
        int[] b=new int[10];
        for (int i=0;i<a.length;i++) {
            b[i]=a[i];
        }
        a=b;
        b=null;
        System.out.println("length of array a : "+a.length);
        for (int i:a) {
            System.out.println(i);
        }
        //2D array
        int[][] twoDArray={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<twoDArray.length;i++){
            for (int j=0;j<twoDArray[0].length;j++){
                System.out.print("\t"+twoDArray[i][j]);
            }
            System.out.println();
        }
        //2D array with different length of column
        System.out.println("2D array with fix row length and varied length column:");
        int[][] twoDArrayWithDiffColumnLen=new int[3][];
        twoDArrayWithDiffColumnLen[0]=new int[4];
        twoDArrayWithDiffColumnLen[1]=new int[5];
        twoDArrayWithDiffColumnLen[2]=new int[6];
        for(int i=0;i<twoDArrayWithDiffColumnLen.length;i++){
            for (int j:twoDArrayWithDiffColumnLen[i]){
                System.out.print("\t"+j);
            }
            System.out.println();
        }
        //Adding 2D matrix same logic for multiplication.
        System.out.println("adding 2D matrix");
        int[][] a1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] a2={{11,22,33},{44,55,66},{77,88,99}};
        int[][] a1a2=new int[3][3];
        for (int i=0;i<a1.length;i++) {
            for(int j=0;j<a1[0].length;j++){
                a1a2[i][j]=a1[i][j]+a2[i][j];
                System.out.print("\t"+a1a2[i][j]);
            }
            System.out.println();
        }
        //Sorting String array.
        String[] str={"htgt","vyjujyh","ggfv","afrgt","bhyjy"};
        Arrays.sort(str);
        for (String tempstr:str) {
            System.out.println(tempstr);
        }
    }
}
