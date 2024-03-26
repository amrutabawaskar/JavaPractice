package javaProjectForPractice;

import javaProjectsForPractice.NumberGuessingGame;
import org.junit.Assert;
import org.junit.Test;

public class NumberGuessingGameTest {
    @Test
    public void compileGuess(){
        int randomNumber=30;
        int guessedNumber=30;
        NumberGuessingGame numberGuessingGame=new NumberGuessingGame();
        String result=numberGuessingGame.compileGuess(randomNumber,guessedNumber);
        System.out.println(result);
        Assert.assertTrue(result.equals("Correct guess"));
    }
}
