package com.adam;

import java.util.Scanner;

public class Main {


    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myArray = getIntegers(4);
        int[] sortedArray = sortInt(myArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int capacity){
        int[] arr = new int[capacity];
        System.out.println("Enter " + capacity + " numbers");
        for(int i= 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        return arr;

    }


    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " value " + array[i]);
        }
    }



    public static int[] sortInt(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temporary;
        while(flag){
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temporary;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
