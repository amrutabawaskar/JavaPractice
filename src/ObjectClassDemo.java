class myClass{
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
//Object class is base class for all other classes.
    //when we create any object, it has basic set of object class methods.such as wait(),equals(),tostring(),hashcode(),notify()
    //and notifyAll(). equals,toString abd hashcode() can be override.
    //hashcode is unique code assigned to each object created.
}
class myClass2{}
public class ObjectClassDemo {
    public static void main(String args[]){
        myClass mc=new myClass();
        myClass2 mc2=new myClass2();
        System.out.println(mc2.hashCode());
        System.out.println(mc.hashCode());
        System.out.println(mc.equals(mc));
        System.out.println(mc);
        System.out.println(mc.toString());
        System.out.println(mc.getClass());
    }
}
