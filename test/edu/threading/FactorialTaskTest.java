package edu.threading;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

public class FactorialTaskTest {

    private ExecutorService executorService;

    @Before
    public void setup() {
        executorService = Executors.newSingleThreadExecutor();
    }

    @Test
    public void test() {
        FactorialTask ft = new FactorialTask(5);
        Future<Integer> future = executorService.submit(ft);
       try {
            assertEquals(120, future.get().intValue());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
