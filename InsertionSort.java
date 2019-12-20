/*#******************************************************************************************************************
        # @purpose :Demonstrate InsertionSort Logic.
        # @file  :InsertionSort.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        String[] s1 = {"aaa","RRR","sss","GGG","nnn"};
        String[] s2 = sort(s1,s1.length);
        System.out.println("the sorted array");
        for(int k=0;k<s2.length;k++) {
            System.out.println(s2[k]);
        }
    }
    public static String[] sort(String[] array,int n) {
        String temp = " ";
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(array[i].compareToIgnoreCase(array[j])>0) {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }


            }
        }
        return array;
    }
}
