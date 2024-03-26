public class ThreadingMethods {
    public static void main(String args[])
    {
     TryThreadingMethods tm=new TryThreadingMethods("MyFirstThread");
    System.out.println("ID "+tm.getId());
    System.out.println("name "+tm.getName());
    System.out.println("priority "+tm.getPriority());
    System.out.println("state "+tm.getState());
        tm.start();
        tm.interrupt();
        System.out.println("state "+tm.getState());

    }
}
class TryThreadingMethods extends Thread{
public TryThreadingMethods(String name){
    super(name);
}
    public void run()
   {
       int counter=0;
       while (true){
           System.out.println(counter++);
           try {
               Thread.sleep(1000);
           }catch(InterruptedException e)
           {
               System.out.println(e);
           }
           }
   }
}
