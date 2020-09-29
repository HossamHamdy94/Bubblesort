package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[50];
        int n, i, j, temp, k;
        Scanner scanner = new Scanner(System.in);


        boolean flag = true;
        System.out.println("Enter the size of array: ");
        n= scanner.nextInt();
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; ++i)
            a[i]=scanner.nextInt() ;

        System.out.println("the unsorted array  ");
        for (i = 0; i < n; ++i)
        {
            System.out.println(a[i] + " ");

        }

        i = 1;
        while ((i<n-1) && (flag = true))
        {
            //f = false;
            flag = false;
            for (j = 0; j<(n - i); ++j){
                if (a[j]>a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                    //f = true;

                }

            }
            System.out.println("the array phase "+ "   "+ i);
            for (k = 0; k < n; ++k){
                System.out.println(a[k]+"  ");
            }
            i++;
        }


        System.out.println( "Array after bubble sort:");
        for (i = 0; i < n; ++i)
             System.out.println("  "+ a[i]);
    }
}
