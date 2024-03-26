import java.util.Scanner;

public  class  ExceptionHandling{
    public static void main(String[] args){

       //Arithmetic exception handling
        int a,b,c;
        a=10;
        b=0;
        try{
        c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e){
        System.out.println(e);
        }

        //Array out of bound exception
        int A[]={30,10,86,763};
        try
        {
            System.out.println("Array division: "+(A[0]/A[5]));
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        //Nested try/catch block
        try{
            int B[]={12,34,0};
            try{
                System.out.println("Division inside nested try/catch : "+(B[1]/B[2]));
            }catch (IndexOutOfBoundsException e){
                System.out.println("Inner try/catch :"+e);
            }
        }catch (ArithmeticException e){
            System.out.println("Outer try/catch: "+e);
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int amount=sc.nextInt();
        if(amount>5000)
        {
            try {
                throw new MyException();
            }catch(MyException e){
               System.out.println(e.toString());
            }
        }
        System.out.println("Bye");


    }

}

class MyException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000/-  ";
    }
}