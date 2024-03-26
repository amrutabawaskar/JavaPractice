public class MultiThreading1{
    public static void main(String args[])
    {
        SubClass obj1=new SubClass();
        obj1.start();
        int i=1;
        while (true){
        System.out.println(i+"Hello");
        i++;
        }
    }
}
class SubClass extends Thread{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"World");
            i++;
        }
    }
}