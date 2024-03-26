package edu.threading;

import java.util.concurrent.Callable;
/*
This is demo of using Callable interface rather than Runnable interface for implementing multithreading.
Callable can call() can receive parameters and return value. Whereas Runnable call() can't.
* */
public class FactorialTask implements Callable<Integer> {


    int number;
    public FactorialTask(int number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        int fact=1;
        for(int count=number;count>1;count--){
            fact=fact*count;
        }
        System.out.println("in delayed mode");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
        System.out.println("outside");
        return fact;
    }
}
