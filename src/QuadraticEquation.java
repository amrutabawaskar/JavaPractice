import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]){
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values for quadratic equation ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double temp=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+temp)/2*a;
        r2=(-b-temp)/2*a;
        System.out.println("r1= "+r1);
        System.out.println("r2= "+r2);
    }
}
