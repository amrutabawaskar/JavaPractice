package collectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MyCollection2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"dfs");
        map.put(2,"cvfdgdfc");

        for (Map.Entry m:map.entrySet()) {
            System.out.println("Key: "+m.getKey()+"Value: "+m.getValue());
        }
        map.putIfAbsent(2323,"");
        map.size();
        map.containsKey(1);

        HashSet<Integer> myset=new HashSet<>();
        myset.add(1);
        myset.add(1);


        var it=myset.iterator();
      while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
