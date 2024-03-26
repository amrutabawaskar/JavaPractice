package collectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonChar {
    public static void main(String[] args) {
        String[] input={"aa","aaa"};
        String[] strings =commonCharacters(input);
        System.out.println("Common chars are:");
        for (String s:strings
             ) {
            System.out.println(s);
        }

    }
    public static String[] commonCharacters(String[] strings) {
        int inputSize = strings.length;
        HashMap<String, Integer> temp = new HashMap<>();

        for (String s : strings) {
            Set<Character> uniqueCharInString = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (!uniqueCharInString.contains(Character.toString(s.charAt(i)))) {
                    uniqueCharInString.add(s.charAt(i));
                    temp.put(Character.toString(s.charAt(i)),
                            temp.getOrDefault(Character.toString(s.charAt(i)), 0) + 1);
                }
            }
        }

        HashSet<String> result = new HashSet<>();
        for (String m : temp.keySet()) {
            if (temp.get(m) == inputSize) {
                result.add(m);
            }
        }
        String[] returnResult = result.toArray(new String[0]);
        return returnResult;
    }
}
