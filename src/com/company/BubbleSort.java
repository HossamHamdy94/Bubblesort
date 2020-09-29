package com.company;

import java.util.Scanner;

public class BubbleSort {
    static void printArray (int[] array ) {
        for (int i = 0; i < array.length; ++i)
            System.out.println("  "+ array[i]);
    }
    static  void makeArray (int [] numbers) {
        int number;
        System.out.println("Enter the Numbers");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i <numbers.length; i++ ){
           number= scanner.nextInt();
           if (number<0){
               System.out.println("Enter valid number");
               i = i-1;
           }else
            numbers[i]= number;
            }
    }
    public static void swap( int[] arr , final int pos1, final int pos2){
        final int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }


    public static void main(String [ ] args) {
        int num ;
        // int [ ] arr = {83, 5, 21, 14, 1};
        int [ ] arr = new int[5];
        int temp;
        makeArray(arr);
        int passCount = 0;
        int swapCount = 0;
        boolean repeat = true;





        // Print the array before sorting
        System.out.println("Before sorting: ");

printArray(arr);
System.out.println();

        // handling sorting
        for (int i=0; i<arr.length-1; i++)
        {
            passCount++;					// number of passes processed
            repeat = false;

            for (int j=0; j<arr.length-i-1; j++) {

                if (arr[j] > arr[j+1] ) {
                    swapCount++;
                    swap(arr,j,j+1);
//                      temp = arr[j];
//                      arr[j]= arr[j+1];
//                      arr[j+1] = temp;
                    repeat = true;
                }
            }

            if (repeat == false)				// already in sequence
                break;

        }

        // printing the result
        System.out.println("After sorting: ");
        printArray(arr);
        System.out.println();

        System.out.println("\n--------------------");
        System.out.println("For this set of number");
        System.out.println("The number of passes    : " + passCount);
        System.out.println("The number of swappings : " + swapCount);

    }
}
