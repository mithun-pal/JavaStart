package com.java.handson.misc;

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        int[] arr = {12,48,10,83,62,17,29};
        boolean found = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int num = reader.nextInt();
       for(int i: arr){
           if(i == num)
           {
               found = true;
               break;
           }
       }
       if(found)
       System.out.println("Number "+ num + " found in the List");
       else
           System.out.println("Number "+ num + " does not exists in the List");

    }
}
