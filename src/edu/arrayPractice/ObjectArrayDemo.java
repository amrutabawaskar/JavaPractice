package edu.arrayPractice;

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] d=new Student[5];
        d[0]=new Student("Manisha",1);
        d[1]=new Student("Ratna",2);
        d[2]=new Student("manjiri",4);
        d[3]=new Student("manjiri",6);
       // d[4]=new ObjectArrayDemo("manjiri",7);
        for (int i=0;i<d.length;i++) {
            if (d[i]==null)
                break;
            else
            System.out.println(d[i].studentID+" : "+d[i].studentName);
        }
    }

}
