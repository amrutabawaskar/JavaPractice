package javaProjectsForPractice.bankApplication;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank theBank=new Bank("Bank of India");

        //Add user with saving account
        User aUser=theBank.addUser("Jon","Karter","1234");

        //Add checking account for aUser
        Account newAccount =new Account("Checking",aUser,theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);

        User curUser;
        while (true){
            //stay in login prompt until successful login
            curUser=ATM.mainMenuPrompt(theBank,sc);
            //main menu prompt
            ATM.promptUserMenu(curUser,sc);
        }
    }
    public static User mainMenuPrompt(Bank theBank,Scanner sc){
        String userID;
        String pin;
        User authUser;

        //Prompt user for user id and pin until correct one is reached
        do{
            System.out.println("Welcome to "+theBank.getName());
            System.out.println("Enter UserID:");
            userID=sc.nextLine();
            System.out.println("Enter Pin");
            pin=sc.nextLine();

        //try to get user object corresponding to the UserId and Pin entered above.
            authUser=theBank.loginUser(userID,pin);
            if(authUser==null){
                System.out.println("UserID/Pin wrong. Please try again");
            }
        }while (authUser==null);
            //continue login until successful login
        return authUser;
    }

    public static void promptUserMenu(User theUser,Scanner sc){
        //Print summary of user's account
        theUser.printAccountSummary();

        int choice;
        //user menu
        do {
            System.out.println("\n\nWelcome "+theUser.getFirstName()+"\n"+
                    "What will you like to do?\n" +
                    " 1)Show transaction history\n"+
                    " 2)Withdrawal\n"+
                    " 3)Deposit\n" +
                    " 4)Transfer\n" +
                    " 5)Exit\n");
            choice=sc.nextInt();
            if(choice<1 || choice>5){
                System.out.println("Incorrect choice. Try again");
            }
            //process choice
            switch (choice){
                case 1:ATM.showTransactionHistory(theUser,sc);
                    break;
                //case 2:ATM.withdraw(theUser,sc);
                //break;
                //case 3:ATM.deposit(theUser,sc);
                //break;
                //case 4:ATM.transfer(theUser,sc);
                //break;
            }
            if(choice!=5){
                ATM.promptUserMenu(theUser,sc);
            }
        }while (choice>1 && choice<5);
    }

    public static void showTransactionHistory(User theUser,Scanner sc){
        int index;
        //get account number whose transaction history look at
       do {
           System.out.println("Enter the account index whose transactions you want to see:"+theUser.numAccounts());
           index=sc.nextInt()-1;
           if(index<0 || index>theUser.numAccounts()){
               System.out.println("Invalid account");
           }
           theUser.printAccountTransactionHistory(index);
       }while (index<0 || index>theUser.numAccounts());

    }
}
