package StudentChallengeInterface;

public class MainInterfaceDemo {
    public static void main(String args[]){
    Store s=new Store();
    Customer c1=new Customer(" Ram ");
    Customer c2=new Customer(" Ramesh ");
    s.register(c1);
    s.register(c2);
    s.callForSell();
    }
}
