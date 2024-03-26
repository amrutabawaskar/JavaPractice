package InterfaceDemo;
//No multiple inheritance allowed.
//extend from one parent class.
//Class can implement multiple interfaces.
//Class need to provide implementation for methods in interfaces.
public class SmartPhone extends Phone implements ICamera,IMusicPlayer {
    @Override
    public void click() {
        System.out.println("click photo");
    }
    @Override
    public void record(){
        System.out.println("record video");
    }
    @Override
    public void play(){
        System.out.println("play music");
    }
    @Override
    public void stop(){System.out.println("stop music");}

    @Override
    public void call(){
        System.out.println("In child Class call()");
    }

    @Override
    public void SMS(){System.out.println("In Child Class SMS()");}
}
