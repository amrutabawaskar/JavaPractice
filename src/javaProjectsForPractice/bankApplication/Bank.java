package javaProjectsForPractice.bankApplication;

import java.util.ArrayList;
import java.util.Random;

public class Bank {


    private  String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

    //Create bank object with empty user and account arraylist
    public Bank(String name) {
        this.name = name;
        this.users=new ArrayList<User>();
        this.accounts=new ArrayList<Account>();
    }

    public String getNewUserUUID(){
        String uuid;
        Random rng=new Random();
        int len=6;
        boolean nonUnique;
        do{
            nonUnique=false;
            uuid="";
            //generate uuid
            for(int i=0;i<len;i++){
                uuid+=((Integer)rng.nextInt(10)).toString();
            }
            //check if it is unique
            for(User u:this.users){
                if(uuid.compareTo(u.getUUID())==0)
                    nonUnique=true;
                    break;
            }
        }while(nonUnique);
        return uuid;
    }
    public String getNewAccountUUID(){
        String uuid;
        Random rng=new Random();
        int len=10;
        boolean nonUnique;
        do{
            nonUnique=false;
            uuid="";
            //generate uuid
            for(int i=0;i<len;i++){
                uuid+=((Integer)rng.nextInt(10)).toString();
            }
            //check if it is unique
            for(Account a:this.accounts){
                if(uuid.compareTo(a.getAccountUUID())==0)
                    nonUnique=true;
                break;
            }
        }while(nonUnique);
        return uuid;
    }
    public void addAccount(Account account){
    this.accounts.add(account);
    }
    public User addUser(String firstName,String lastName,String pin){
        //create a new user and add it to banks users list
        User newUser=new User(firstName,lastName,pin,this);
        this.users.add(newUser);

        //create savings account for new user
        Account newAccount=new Account("saving",newUser,this);
        newUser.addAccount(newAccount);
        this.addAccount(newAccount);

        return newUser;
    }

    public User loginUser(String uuid,String pin){
        for(User u:this.users){
            if(u.getUUID().compareTo(uuid)==0 && u.validatePin(pin)){
                return u;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }
}
