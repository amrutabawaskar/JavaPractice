package staticandfinal;

public class Car {
    //static variables are shared commonly by all objects of a class.
    //If one object alters value of static object then its changed for all objects.
    static int price=1000000;

    //Static methods shared by all objects.
    //If many static methods then make separate static class.
    //static method can access only static variables of a class.
    static double onRoadPrice(String city)
    {
        double onRoadPrice=0;
        switch (city){
            case "Dehli": onRoadPrice=price+price*0.1;
            case "Mumbai": onRoadPrice=price+price*0.09;
        }
    return  onRoadPrice;
    }
}
