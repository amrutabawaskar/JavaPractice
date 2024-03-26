package SingletonDemo;

public class SingletonMain {
    public static void main(String args[]) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();

        //c1 and c2 referring to single instance of class CoffeeMachine.
        //SingletonDemo.CoffeeMachine@5305068a
        //SingletonDemo.CoffeeMachine@5305068a
        System.out.println(c1 + "\n" + c2);
    }
}
