package javaProjectsForPractice;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber= (int) (100*Math.random());
        Scanner sc=new Scanner(System.in);

        NumberGuessingGame tryIt=new NumberGuessingGame();
        String repeat;
        do {
            System.out.println("Guess the number");
            int guessedNumber= sc.nextInt();
            String result=tryIt.compileGuess(randomNumber,guessedNumber);
            System.out.println(result);
            if(result.equals("Correct guess"))
                break;
            System.out.println("Do you want to try it again?(y/n)");
            repeat=sc.next();
        }while (repeat.equals("y"));
        System.out.println("Well tried...Number is:"+randomNumber);
    }
    public String compileGuess(int randomNumber,int guessedNumber){
        if(randomNumber==guessedNumber){return "Correct guess";}
        else if(randomNumber>guessedNumber){return "guess bigger number";}
        else if(randomNumber<guessedNumber){return "guess smaller number";}

        return "";
    }
}
