package SingletonDemoTest;

import SingletonDemo.CoffeeMachine;
import org.junit.Assert;
import org.junit.Test;

public class SingletonCoffemachineTest {
    @Test
    public void getSingletoneCoffeMachine(){
        CoffeeMachine c1=CoffeeMachine.getInstance();
        CoffeeMachine c2=CoffeeMachine.getInstance();
        Assert.assertTrue(c1.equals(c2));
    }
}
