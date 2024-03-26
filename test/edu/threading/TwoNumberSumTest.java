package edu.threading;

import algoexpert.TwoNumberSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoNumberSumTest {
    @Test
    public void test(){
        int[] array={3,5,-4,8,11,1,-1,6};
        int targetSum=10;
        int[]result={11,-1};
        Assert.assertArrayEquals(TwoNumberSum.twoNumberSum(array,targetSum),result);
    }
}
