package ReflectionDemoClass;
/*Reflection class is use to know details about a class such as its parameters,
* constructors,methods and all. */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class My{
    public int a;
    protected int b;
    private int c;
    int d=122;


    public My(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public My() {}


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

public class ReflectionDemo {
    public static void main(String args[]){
        //create object of type Class and assign it with the class reference.
        Class c=My.class;
        System.out.println(c.getSimpleName());
        System.out.println(c.getName());

        System.out.println("Fields: ");
        Field field[]=c.getDeclaredFields();
        for(Field f:field)
        {
            System.out.println(f);
        }

        System.out.println("Constructors:");
        Constructor con[]=c.getDeclaredConstructors();
        for(Constructor cc:con){
            System.out.println(cc);
        }

        System.out.println("Methods: ");
        Method m[]=c.getDeclaredMethods();
        for(Method mm:m){
            System.out.println(mm);
        }
    }
}
