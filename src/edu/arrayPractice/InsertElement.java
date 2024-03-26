package edu.arrayPractice;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        // Original array
                int[] originalArray = {1, 2, 3, 4, 5};

                // Element and index to insert
                int elementToInsert = 10;
                int indexToInsert = 2;

                // Check if the index is valid
                if (indexToInsert < 0 || indexToInsert > originalArray.length) {
                    System.out.println("Invalid index to insert");
                    return;
                }

                // Create a new array with increased size
                int[] newArray = new int[originalArray.length + 1];

                // Copy elements up to the index
                System.arraycopy(originalArray, 0, newArray, 0, indexToInsert);

                // Insert the new element
                newArray[indexToInsert] = elementToInsert;

                // Copy the remaining elements
                System.arraycopy(originalArray, indexToInsert, newArray, indexToInsert + 1, originalArray.length - indexToInsert);

                // Print the updated array
                System.out.println("Original array: " + Arrays.toString(originalArray));
                System.out.println("Array after inserting element: " + Arrays.toString(newArray));
            }
        }


