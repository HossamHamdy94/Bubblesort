package com.company;

import java.util.Scanner;

public class Main {


    static void printArray (int[] array ) {
        for (int i = 0; i < array.length; ++i)
            System.out.println("  "+ array[i]);
    }

    public static void main(String[] args) {


        boolean isSorted = true;
        int[] a ;
        a = new int[]{83, 5, 21, 14, 77};
        int n, i, j, temp, k;
        Scanner scanner = new Scanner(System.in);


        System.out.println("the unsorted array  ");
        printArray(a);
        i = 1;
        while ((i<a.length-1) && (isSorted = true))
        {
            isSorted = false;
            for (j = 0; j<(a.length - i); ++j){
                if (a[j]>a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (isSorted== false)break;
            System.out.println("Round "+ " "+ i);
            printArray(a);

            i++;

        }
        System.out.println( "Array after bubble sort:");
        printArray(a);
    }

}
