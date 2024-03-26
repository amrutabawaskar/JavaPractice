package edu.collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class CollectionPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"aa");
        map.put(2,"bb");

        //traverse map
        for (Map.Entry e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //check if key present in map
        System.out.println(map.containsKey(1));
    }
}
