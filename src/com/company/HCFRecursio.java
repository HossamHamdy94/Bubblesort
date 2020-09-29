package com.company;

public class HCFRecursio {



        // Recursive function to return gcd of a and b
        static int calculateHCF(int a, int b)
        {
            // Everything divides 0
            if (a == 0)
                return b;
            if (b == 0)
                return a;

            // base case
            if (a == b)
                return a;

            // a is greater
            if (a > b)
                return calculateHCF(a-b, b);
            return calculateHCF(a, b-a);
        }

        // Driver method
        public static void main(String[] args)
        {
            int a = 98, b = 56;
            System.out.println("HCF of " + a +" and " + b + " is " + calculateHCF(a, b));
        }
    }

