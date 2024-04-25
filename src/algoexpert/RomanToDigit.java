package algoexpert;

import java.util.HashMap;


public class RomanToDigit {

    public int romanToInt(String s) {
        // Create a mapping of Roman numeral characters to their integer values
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result=0;

        // Iterate through the Roman numeral string
        for(int i=0;i<s.length();i++){
            char prevChar=s.charAt(i);
            int prevDigit=romanMap.get(prevChar);

            // If the next character exists and its value is greater than the current character's value,
            // subtract the current character's value from the result
            if(i<s.length()-1){
                char nextChar=s.charAt(i+1);
                int nextDigit=romanMap.get(nextChar);

                if(prevDigit<nextDigit){
                    result=result-prevDigit;
                }
                else {
                    result=result+prevDigit;
                }
            }
            else result=result+prevDigit;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToDigit romanToInteger = new RomanToDigit();

        // Test cases
        String roman1 = "III";
        String roman2 = "IV";
        String roman3 = "IX";
        String roman4 = "LVIII";
        String roman5 = "MCMXCIV";

        System.out.println(roman1 + " = " + romanToInteger.romanToInt(roman1)); // 3
        System.out.println(roman2 + " = " + romanToInteger.romanToInt(roman2)); // 4
        System.out.println(roman3 + " = " + romanToInteger.romanToInt(roman3)); // 9
        System.out.println(roman4 + " = " + romanToInteger.romanToInt(roman4)); // 58
        System.out.println(roman5 + " = " + romanToInteger.romanToInt(roman5)); // 1994
    }
}

