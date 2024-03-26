import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void closestNumbers(List<Integer> arr) {
        // Write your code here
        List<List<Integer>> pairs = new ArrayList<>();
        int m = Integer.MAX_VALUE;
        Collections.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int d = Math.abs(arr.get(i+1) - arr.get(i));
            if (d == m) {
                pairs.add(new ArrayList<>());
                pairs.get(j).add(arr.get(i));
                pairs.get(j).add(arr.get(i+1));
                j++;
            }else if (d < m){
                m = d;
                pairs.clear();
                j = 0 ;
                pairs.add(new ArrayList<>());
                pairs.get(j).add(arr.get(i));
                pairs.get(j).add(arr.get(i+1));
                j++;
            }
        }
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i).get(0)+" "+pairs.get(i).get(1));
        }
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.closestNumbers(arr);

        bufferedReader.close();
    }
}
