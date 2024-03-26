package InterfaceDemo;

public class InterfaceExample {
    public static void main(String args[]){
        //s can access all methods that are implemented and extended.
        SmartPhone s=new SmartPhone();
        s.play();
        s.stop();
        s.click();
        s.record();
        s.call();
        s.SMS();

        //c can access only ICamera interface methods.
        ICamera c=s;
        c.click();
        c.record();

        //m can access only IMusicPlayer interface methods.
        IMusicPlayer m=s;
        m.play();
        m.stop();

        //p can access only Phone parent class methods.Child override methods will be executed.
        Phone p=s;
        p.call();
        p.SMS();
    }
}
