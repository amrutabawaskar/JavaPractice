package edu.threading;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class CallableDemoTest {
    private ExecutorService executorService;
    @Before
    public void setup(){
        executorService= Executors.newSingleThreadExecutor();
    }
    @Test
    public void test() throws ExecutionException, InterruptedException {
        CallableDemo cd=new CallableDemo();
        Future f=executorService.submit(cd);

        assertEquals(45,f.get());
    }
}
