import java.util.Scanner;

public class ArithmaticExpressions {
    public static void main(String args[]){
        float height,base,area;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter height of triangle:");
        height=input.nextFloat();
        System.out.println("Enter base of triangle:");
        base=input.nextFloat();
        area=(height*base)/2;
        System.out.println("Area of triangle: "+area);
    }
}
