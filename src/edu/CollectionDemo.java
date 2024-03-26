package edu;

import java.util.ArrayList;
import java.util.List;

/**
 Validates subsequence if present in array in any order.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(12);
        array.add(34545);
        array.add(123);
        array.add(567);

        List<Integer> sequence = new ArrayList<>();
        sequence.add(12);
        sequence.add(123);


        for (int j = 0; j < array.size(); j++) {
            for (int i = 0; i < sequence.size(); ) {
                if (sequence.get(i) == array.get(j)) {
                    i++;
                    if (i == sequence.size())
                        System.out.println("true");

                }

            }

            System.out.println("false");
        }
    }}
