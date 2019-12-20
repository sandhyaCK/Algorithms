/*#******************************************************************************************************************
        # @purpose :Demonstrate BinarySearch Logic.
        # @file  :BinarySearch.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class BinarySearch {
    public static int search(String[] a,String n){
        int l = 0;
        int r = a.length;
        while(l<r) {
            int mid = ((l+r)/2);

            int res = n.compareTo(a[mid]);

            if(res>0){
                l = mid+1;
            }
            else if(res<0) {
                r= mid-1;
            }
            else if(res==0) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] a = {"aaa","bbb","ccc","ddd","eee"};

        System.out.println("key found at "+ search(a, "ccc") + " position");


    }
}
