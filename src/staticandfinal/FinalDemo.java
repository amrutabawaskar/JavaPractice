package staticandfinal;

public class FinalDemo {
    //final variables are constant and cant be changed.
    final int MIN=100;
    //need to be initialized.
    final int MAX;
    static final int AVG;
    // constructor initializes final constant.
    public FinalDemo(int max) {
        MAX = max;
    }
    //static block to initialize the final constants.
    static {
        AVG=200;
    }
    //Final methods cannot be overridden.
    final void welcome(){
        System.out.println("Welcome in final demo");
    }
    //final class cannot be extended.
}
