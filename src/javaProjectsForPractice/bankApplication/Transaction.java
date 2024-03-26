package javaProjectsForPractice.bankApplication;

import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String memo;

    //Account in which transaction is performed
    private Account inAccount;

    public Transaction(double amount, Account account) {
        this.amount = amount;
        this.inAccount = account;
        this.timestamp=new Date();
        this.memo="";
    }
    public Transaction(double amount, Date timestamp, String memo, Account inAccount) {
        //Call two argument constructor first
        this(amount,inAccount);
        //set the memo
        this.memo = memo;
    }
    public double getAmount() {
        return amount;
    }
    public String getSummaryLine(){
        if(this.amount>=0){
            return String.format(this.timestamp+" "+this.amount+" "+this.memo);
        }
        else return String.format(this.timestamp+" "+this.amount+" "+this.memo);
    }
}
