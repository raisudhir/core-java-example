package com.objective;

import java.util.Scanner;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum =0;
        for(int i = 0; i < ar.length; i++)
        {
            
           sum =sum + ar[i];   
            
        }
        return sum;
    }

    public static void main(String[] args)  {
       
    	Scanner sc = new Scanner(System.in);
    }
}
