public class ThreadDemonYeildJoin {
    public static void main(String args[]){
        MyThread mt=new MyThread();
       //Set thread class as demon class.It will get interrupted as soon as the main class gets over.
       // mt.setDaemon(true);
        mt.start();

        //Join function : main will wait for other threads to complete.
       Thread mainThread=Thread.currentThread();
       // try {
      //      mainThread.join();
       // }catch (InterruptedException e){System.out.println(e);}

    //Yield function: give priority while running.
        int counter=0;
        while (true) {
            System.out.println("Main "+counter++);
           // mainThread.yield();
        }
    }



}
class MyThread extends Thread{
    public void run(){
        int counter=0;
        while(true){
            System.out.println("Thread "+counter++);
        }
    }
}
