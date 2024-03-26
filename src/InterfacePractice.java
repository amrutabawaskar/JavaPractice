interface ITest{
    //method can have static final identifiers. need to be in capital letters.
    static final int X=10;
    //interface has method declaration.
    public abstract void math1();
    public abstract void math2();

    //Interface can have static method with definition.
    public static void math3() {
        System.out.println(" Inside meth3");
    }
    //default method in interface to mask the interface method and give new declaration and implementation.
    //Default methods enable you to add new functionality to existing interfaces and ensure binary compatibility
    // with code written for older versions of those interfaces.
    // In particular, default methods enable you to add methods that accept lambda expressions as parameters
    // to existing interfaces.
     default void math5(){
        System.out.println(" default math5");
        doIt();
    }
    private void doIt(){}
}

//interface can extend from other interface.
interface  ITest2 extends ITest{
    void math4();
}

class MyClass1 implements ITest2{
    @Override
    public void math2() {
        System.out.println("math2");
    }

    @Override
    public void math4() {
        System.out.println("math4");
    }

    @Override
    public void math1() {
    System.out.println("math1");
    }

    @Override
    public void math5() {
        System.out.println("overrided math5");
    }
}
public class InterfacePractice {
    public static void main(String args[]){

        // Access ITest class identifier and methods with class name.
    System.out.println("Identifier X from interface which is static and final : "+ITest.X);
    ITest.math3();
    //Create reference to class which has implemented methods and access all methods.
    MyClass1 my=new MyClass1();
    my.math1();
    my.math2();
    my.math4();
    my.math5();
    }
}
