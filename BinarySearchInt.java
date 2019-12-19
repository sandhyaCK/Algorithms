/*#******************************************************************************************************************
        # @purpose :Demonstrate BinarySearchInt Logic.
        # @file  :BinarySearchInt.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class BinarySearchInt {
    public static void search(int[] a,int n) {
        int l=0;
        int r=a.length;
        while(l<r) {
            int mid=(l+r)/2;
            if(a[mid]==n) {
                System.out.println("element found at" +mid );
                break;
            }else if(a[mid]>n) {
                r=mid-1;
            }
            else if(a[mid]<n) {
                l=mid+1;
            }
            else {
                System.out.println("element not found");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        search(a,7);
    }
}
