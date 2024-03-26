//Enum created with list of constants as department names in it.
//For each constant value, properties added such as HOD name and location of department.
//if constant has properties, need to create constructor of it.
enum dept{
    CS("xyz","mumbai"),
    ECE("xyz","dehli"),
    CIVIL("xyz","pune")

    ,MECH("xyz","chennai");

    //enum variables created.
    String head;
    String location;

    //constructor created for properties.
    dept(String name,String loc){
    this.head=name;
    this.location=loc;
    }
    //methods to access enum constant properties.
    public String returnLocation(){
        return this.location;
    }
    public String returnHead(){
        return head;
    }
}

public class EnumDemo {
    public static void main(String args[]){
        dept d1=dept.CS;
        System.out.println("Enum constant value:"+d1.name());
        System.out.println("Enum constant properties assigned:\nHead "+d1.returnHead()+"\nLocation: "+d1.returnLocation());
    }
}
