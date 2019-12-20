/*#******************************************************************************************************************
        # @purpose :Demonstrate PrimeNumber Logic.
        # @file  :PrimeNumber.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 1000;
        int i = 2;
        for (n = 1; n < 1000; n++) {
            boolean isprime = true;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                }

            }

            if (isprime) {
                System.out.println(n);
            }
        }
    }
}