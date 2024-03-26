//A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc).
// In other words, wrapper classes provide a way to use primitive data types (int, char, short, byte, etc) as objects.
// These wrapper classes come under java.util package.
//
//Why we need Wrapper Class
//Wrapper Class will convert primitive data types into objects.
// The objects are necessary if we wish to modify the arguments passed into the method
// (because primitive types are passed by value).

//The classes in java.util package handles only objects and hence wrapper classes help in this case also.

//Data structures in the Collection framework such as ArrayList and Vector store only the objects
// (reference types) and not the primitive types.

//The object is needed to support synchronization in multithreading.
public class WrapperClassDemo {
    public static void main(String args[]){
        Integer m1= 100;
        int m2=200;

        //Float wrapper class[checked isNan(),isFinite(),isInfinite(),toString(),POSITIVE_INFINITY,NEGATIVE_INFINITY]
        float f1=12;
        Float f2=12.87f;
        Float f3=f1;
       // System.out.println("f2="+f2+"  F3="+Float.isNaN(f3));

        //Character and Boolean
        Character c1='#';
        Character c2='A';
        System.out.println(" To uppercase "+Character.isLetterOrDigit(c1));

        Boolean b1=true;
        boolean b2=false;
        System.out.println(" Boolean "+b1.booleanValue());
        System.out.println(" Boolean "+Boolean.compare(b1,b2));
    }
}
