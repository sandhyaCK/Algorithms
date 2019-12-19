/*#******************************************************************************************************************
        # @purpose :Demonstrate Permutation Logic.
        # @file  :Permutation.java
        # @author :Sandhya
   #*****************************************************************************************************************/

package com.BridgeLabz.Algorithms;
public class Permutation {
    static void print(String s ,String a) {
        if(s.length()==0) {
            System.out.println(a + " ");
            return;
        }
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            String ros = s.substring(0,i) +s.substring(i+1);
            print(ros,a+c);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        print(s," ");


    }

}
