public class StringBufferBuilder {
    public static void main(String args[]){
        String s1=new String("hello");//immutable:size will be fixed
        StringBuffer s2=new StringBuffer("hello");//mutable:buffer size is 16 and can be utilized. thread safe if it is a shared object.
        StringBuilder s3=new StringBuilder("hello");//not thread safe. Should not be used if it is shared object.

        System.out.println("String "+s1.concat("world"));
        System.out.println("String buffer "+s2.append("world"));
        System.out.println("String builder "+s3.append("world"));

        char[] s4=new char[10];


    }
}
