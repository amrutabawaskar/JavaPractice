package edu.algoexpert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonChars {
    public static void main(String[] args) {
        commonCharacters(new String[]{"abc", "bcd", "cbad"});
    }
    public static String[] commonCharacters(String[] strings){
        Set<String> potentialCommonChars=new HashSet<>();
//        Set<Character> chars = strings[0].chars().mapToObj(e->(char)e).collect(Collectors.toSet());;
        for (Character c: strings[0].toCharArray()) {
            potentialCommonChars.add(c.toString());
        }
        HashMap<String,Integer> counter=new HashMap<>();

//        for (int i = 1; i <strings.length ; i++) {
//
//        }


        System.out.println(potentialCommonChars);
        return null;
    }
}
