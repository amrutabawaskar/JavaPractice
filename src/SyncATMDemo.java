public class SyncATMDemo {
    public static void main(String args[]){
        ATM atm=new ATM();
        Customer cust1=new Customer("John",100,atm);
        Customer cust2=new Customer("Johnney",200,atm);
        cust1.start();
        cust2.start();
    }
}
    class ATM{
     synchronized public void checkBalance(String custName,int amt){
        System.out.println(custName+" is checking his account balance");
        try{Thread.sleep(1000);}catch (Exception e){}
          System.out.println("Balance: "+amt);
    }
        synchronized  public void withdraw(String custName,int amt){
        System.out.println(custName+" withdrawal amount: "+amt);
            try{Thread.sleep(1000);}catch (Exception e){}

    }
}

class Customer extends Thread{
    ATM atm;
    int amount;
    String custName;

    public Customer(String custName,int amount,ATM atm){
        this.custName=custName;
        this.amount=amount;
        this.atm=atm;
    }
    public void run(){
        atm.checkBalance(custName,amount);
        atm.withdraw(custName,amount);
    }
}