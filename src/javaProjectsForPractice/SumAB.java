package javaProjectsForPractice;

import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        SumAB sumAB=new SumAB();
        System.out.println("Enter A:");
        a=sc.nextInt();
        System.out.println("Enter B:");
        b=sc.nextInt();
        int sum=sumAB.doSum(a,b);
        System.out.println("Sum is: "+sum);
    }
    public int doSum(int a,int b){
        return a+b;
    }
}
