package javaProjectsForPractice.bankApplication;

import java.util.ArrayList;

public class Account {
    private String name;

    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder,Bank theBank) {
        this.name = name;
        this.holder = holder;

        this.uuid = theBank.getNewUserUUID();
       //initialize transaction for account
        this.transactions=new ArrayList<Transaction>();
    }
    public String getAccountUUID(){
        return this.uuid;
    }
    public String getAccountSummaryLine(){
        //get the account balance
        double balance=this.getBalance();
        //format summary line depending on balance -ve or +ve
        if(balance>=0){
           return String.format(this.uuid+" "+" "+balance+" "+this.name);
        }
        else {
            return String.format(this.uuid+" "+" ("+balance+") "+this.name);
        }
    }
    public double getBalance(){
        double balance=0;
        for(Transaction t:transactions){
            balance +=t.getAmount();
        }
        return balance;
    }

    public void printTransactionHistory(){
        System.out.println("Transaction history for account "+this.uuid);
        for (int i=this.transactions.size()-1;i>=0;i--){
            System.out.println(this.transactions.get(i).getSummaryLine());
        }
        System.out.println();
    }
}
