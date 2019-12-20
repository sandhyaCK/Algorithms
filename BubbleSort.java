
/*#******************************************************************************************************************
        # @purpose :Demonstrate BubbleSort Logic.
        # @file  :BubbleSort.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class BubbleSort {
    public static void sort(int[]a) {
        int n=a.length;

        for(int  i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[j-1]>a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;

                }

            }
        }


    }

    public static void main(String[] args) {
        int[] a = {4,3,9,6,2,5};
        sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }


    }
}
