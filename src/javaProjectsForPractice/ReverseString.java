package javaProjectsForPractice;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        System.out.println("Reversed string :"+reverseString.reverseString(reverseString.dummy));
    }
    String dummy="WORLD";
    public StringBuffer reverseString(String dummy){
        return new StringBuffer(dummy).reverse();
    }
}
