public class MultiThreadingUsingRunnable implements Runnable{
    public void run(){
        int i=1;
        while (true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String args[]){
        MultiThreadingUsingRunnable obj1=new MultiThreadingUsingRunnable();
        Thread t=new Thread(obj1);
        t.start();

        int i=1;
        while (true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
