/*#******************************************************************************************************************
        # @purpose :Demonstrate MessageModification Logic.
        # @file  :MessageModification,java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.Algorithms;

public class MessageModify {
    public static void main(String[] args) {
        String[] s1 = {" Hello", "<<name>>",", We have your full name as"," <<full name>>"," in our system. your contact number is"," 91-xxxxxxxxxx",". Please,let us know in case of any clarification Thank you BridgeLabz"," 01/01/2016."};

        s1[1]= s1[1].replace(s1[1]," sandhya.C");
        s1[3]= s1[3].replace(s1[3]," sandhya Chandrappa");
        s1[5]= s1[5].replace(s1[5]," 91-7708159396");
        s1[7]= s1[7].replace(s1[7]," 07/12/2019.");
        for(int i=0;i<s1.length;i++) {
            System.out.print(s1[i]);
        }


    }
}