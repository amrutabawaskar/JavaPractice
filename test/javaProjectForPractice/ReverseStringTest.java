package javaProjectForPractice;

import javaProjectsForPractice.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void revereStringTest(){
        String dummy="HELLO";
        ReverseString rv=new ReverseString();
        String result = rv.reverseString(dummy).toString();
        System.out.println("dummy"+dummy+"\n"+"reverse: "+ result);
        Assert.assertTrue(dummy!= result);
    }
}
