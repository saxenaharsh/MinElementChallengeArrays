package com.HarshSaxena;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntArray = getIntegers(5);
        int[] sortedArrayed = sortArray(myIntArray);
        //findMin(sortedArrayed);
        System.out.println("The minimum number in the array is " + findMin(sortedArrayed));

    }

    public static int[] getIntegers(int count){
        System.out.println("Enter " + count + " random numbers\r");
        int[] countArray = new int[count];
        for(int i = 0; i < countArray.length; i++){
            countArray[i] = scanner.nextInt();
        }
        return countArray;
    }

    public static int findMin(int[] array){
        return array[array.length - 1];

    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;

    }
}
