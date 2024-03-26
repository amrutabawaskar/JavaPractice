package interprocess;
/*This package has 4 classes to demonstrate interprocess communication for shared object*/
class myData {
    //value is been set and get by producer and consumer classes
int value=0;
//flag is used by producer(use when its true) and consumer(use when its false).
boolean flag=true;

   synchronized public int getValue() {
       while (flag!=false)
           try{wait();}catch(Exception e){}

       //set flag for consumer
       flag=false;
        //notify other thread that it has consumed the value.
       notify();
       return value;

    }

   synchronized public void setValue(int value) {
       while (flag!=true)
           try{wait();}catch (Exception e){}

           this.value = value;
          //set flag for producer
           flag=true;
           //notify other threads that it has produce value
           notify();
    }
}
class Producer extends Thread{
    myData data;
    public Producer(myData d){
        this.data=d;
    }

    public void run(){
        int counter=1;
        while(true){
            data.setValue(counter);
            System.out.println("Producer: "+counter);
            counter++;
        }

    }
}

class Consumer extends Thread{
    myData data;
    public Consumer(myData d){
        this.data=d;
    }

    public void run(){
        while(true){
            System.out.println("Consumer: "+data.getValue());
        }

    }
}

public class InterProcessCommunication {
    public static void main(String args[])
    {
    myData d=new myData();
    Producer p=new Producer(d);
    Consumer c=new Consumer(d);

    p.start();
    c.start();
    }
}
