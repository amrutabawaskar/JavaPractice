package algoexpert;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        int x=121;
        if(x<0||(x%10==0 && x!=0)){
            System.out.println("False");
        }

        int reverseNum=0;
        int actualNum=x;

        while(x>0){
            int digit=x%10;
            reverseNum=reverseNum*10+digit;
            x=x/10;
        }
        System.out.println(actualNum+" "+reverseNum);
        if(actualNum==reverseNum){
            System.out.println("true");
        }
        else System.out.println("false");;
    }
}
