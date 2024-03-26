package SingletonDemo;

public class CoffeeMachine {
    private float sugerQty;
    private float coffeeQty;
    private float waterQty;
    private  float milkQty;
   static private CoffeeMachine myCoffeeMachine=null;

    private CoffeeMachine(float sugerQty, float coffeeQty, float waterQty, float milkQty) {
        this.sugerQty = sugerQty;
        this.coffeeQty = coffeeQty;
        this.waterQty = waterQty;
        this.milkQty = milkQty;
    }

    public static  CoffeeMachine getInstance(){
        if(myCoffeeMachine==null){
            myCoffeeMachine=new CoffeeMachine(0.12f,0.234f,0.22f,0.45f);
        }
        return myCoffeeMachine;
    }
}

