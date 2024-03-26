package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MyCollections {

    public static void main(String args[]){

        //HashMap comes with key value pair
        HashMap<Integer,String> map=new HashMap();

        // put values with put method. keys are always unique
        map.put(1,"mango");
        map.put(2,"banana");
        map.put(3,"apple");
        //if same key, value will be replaced with new given value.
       // map.put(1,"orange");
        System.out.println("Map key values: ");
        for (Map.Entry m:map.entrySet()) {
            System.out.println("Key: "+m.getKey()+"Value: "+m.getValue());
        }
        map.putIfAbsent(10,"grapes");

        HashMap<Integer,String> newMap=new HashMap<>();
        newMap.putAll(map);
        newMap.put(102,"kiwi");
        System.out.println("New Map");
        for (Map.Entry m:newMap.entrySet()) {
            System.out.println("Key "+m.getKey()+"value "+m.getValue());
        }
    }
}
