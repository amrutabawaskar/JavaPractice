package classroom;

class whiteBoard{
    String text;
    int attendance=0;
    int counter=0;

   synchronized public String getText() {
       while (counter==0)
           try{wait();}catch(Exception e){}

       counter--;
           if(counter==0)
           notify();
        return text;
    }

   synchronized public void setText(String text) {
       System.out.println("Teacher is writting: "+text);
       while (counter!=0)
           try{wait();}catch(Exception e){}
        this.text = text;
        counter=attendance;
        notify();

    }

    public void takeAttendance(){
        attendance++;
    }

}
class teacher extends Thread{
    whiteBoard w;
    String text[]={"java is a language","It is platform independent","It is object oriented programming","end"};
    public teacher(whiteBoard w) {
        this.w = w;
    }

    public void run(){
        for(int i=0;i<text.length;i++){
            w.setText(text[i]);
        }
    }
}
class student extends Thread{
    whiteBoard w;
    String text;
    String studentName;
    public student(whiteBoard w,String name) {
        this.w = w;
        this.studentName=name;
        w.takeAttendance();
    }
    public void run(){
        do {
            text=w.getText();
            System.out.println(studentName + " is reading" + text);
            System.out.flush();
        }while (!text.equals("end"));
        }

}
public class ThreadClassroom {
    public static void main(String args[]){
    whiteBoard wb=new whiteBoard();

    teacher t= new teacher(wb);
    student s1=new student(wb,"1.John");
    student s2=new student(wb,"2.Johnny");
    student s3=new student(wb,"3.Jimmy");
    student s4=new student(wb,"4.Jasmin");

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
