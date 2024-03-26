package javaProjectForPractice;

import javaProjectsForPractice.SumAB;
import org.junit.Assert;
import org.junit.Test;

public class SumABTest {
    @Test
    public void doSum(){
        SumAB sumAB=new SumAB();
        int a=10,b=20;
        int sum=sumAB.doSum(a,b);
        Assert.assertEquals(30,sum);
    }
}
