package PracticeLambdaExpressions;
class my2{
    //A method taking interface as parameter.
    public void my2Method(MyLambda m){
        m.display();
    }
}
class my3{
    //callablemethod getting interface and calling the display method.
    void callableMethod(MyLambda m){
        m.display();
    }
}

//class my1 {
    //class variables can be access in lambda methods and they are not final.
    // int classVar=10;
    //public void method1(){
    //  int i = 0;
    //MyLambda m2=(s)-> {
    //local variable in lambada method is final. Its value cant be changed.
    //  System.out.println(s+"? \nLocal variable:  "+i+"\n class variable"+classVar++);
    //};
    //m2.display("Can we access local variabls in lambda methods");
    //}
//}
    public class My {
        public static void main(String args[]) {

            //Inner class demo
            //  MyLambda m=new MyLambda() {
            //@Override
            // public void display() {
            //    System.out.println("Inner class");
            //  }
            //};
            //  m.display();

            //method having parameter
            //  MyLambda m1=(s)->{System.out.println("In display lambda expression "+s);};
            // m1.display("amruta");

//Local variable demo
            // my1 m1=new my1();
            //m1.method1();

            //pass lambada expression as method parameter.
            my3 m3=new my3();
            m3.callableMethod(()->{System.out.println("Hello \n passing lambda expression to calling method ");});
        }
    }

