package javaProjectsForPractice.bankApplication;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;
public class User {
    private String firstName;
    private String lastName;
    private String uuid;
    private byte pinHash[];

    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pinHash,Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Get hash code for pin number
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            this.pinHash= md.digest(pinHash.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        //Get new unique universal id for uuid
        this.uuid=theBank.getNewUserUUID();

        //Get empty list of accounts for user
        this.accounts=new ArrayList<Account>();

        //Log user creation information.
        System.out.println("User is created :\nFirst name: "+firstName+"\nLast name: "+lastName+
                "\nUnique ID: "+this.uuid);
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }
    public String getUUID(){
        return this.uuid;
    }

    //Validate user with entered pin
    public boolean validatePin(String pin){
        try {
            //encrypt pin and compare with original pin
            MessageDigest md=MessageDigest.getInstance("MD5");
            if(MessageDigest.isEqual(this.pinHash, md.digest(pin.getBytes()))){
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }
    public void printAccountSummary(){
        System.out.println("Account Summary "+this.firstName);
        for (int i=0;i<accounts.size();i++){
            System.out.printf("\n"+(i+1)+" "+this.accounts.get(i).getAccountSummaryLine());
        }
    }
    public void printAccountTransactionHistory(int accountIndex){
        accounts.get(accountIndex).printTransactionHistory();
    }
    public int numAccounts(){
        return this.accounts.size();
    }

}
