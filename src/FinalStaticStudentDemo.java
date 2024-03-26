import java.util.Calendar;
import java.util.Date;

class Student{
    private static int RollNumberCounter=1;
    final static  String UNICODE="PuneUNI-";
    private String rno;
    public Student() {
        rno=assignRollNumber();
    }

    static String assignRollNumber(){
        Date d=new Date();
        String rollnumber=UNICODE+Calendar.getInstance().get(Calendar.YEAR)+"-" +RollNumberCounter;
        RollNumberCounter++;
        Show(rollnumber);

        return rollnumber;
    }
    public static void Show(String roll){

        System.out.println(roll);
    }
}
public class FinalStaticStudentDemo {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

    }
}
