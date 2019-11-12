package com.hackerrankday7.app;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variable declaration
        int arrayElemets = 0;
        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input array size
        arrayElemets = in.nextInt();
        //Array declaration
        int numbersArray[] = new int[arrayElemets];

        //Input numbers to array
        for(int i = 0; i < arrayElemets; i++)
        {
            numbersArray[i] = in.nextInt();
        }

        //Output reverse array
        for(int i = arrayElemets-1; i >= 0; i--)
        {
            System.out.print(numbersArray[i]+" ");
        }

        //Close input
        in.close();
    }
}
