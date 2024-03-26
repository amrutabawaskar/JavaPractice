package studentChallengeInterfaceTest;

import StudentChallengeInterface.Customer;
import StudentChallengeInterface.IMember;
import StudentChallengeInterface.Store;
import org.junit.Assert;
import org.junit.Test;

public class StoreTest {
    Store s=new Store();
    Customer c1=new Customer("Ram");
    Customer c2=new Customer("Shyam");
    @Test
    public void registerTest(){
        int count=s.register(c1);
        Assert.assertEquals(1,1);
    }

    @Test
    public void callForSaleTest(){
        s.register(c1);
        s.register(c2);
        String name=s.callForSell();
        Assert.assertEquals("Ram","Ram");
    }
}
