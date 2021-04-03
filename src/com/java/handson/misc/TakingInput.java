package com.java.handson.misc;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class TakingInput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[4];
        int sum=0;
        /*
        String[] stArr=new String[4];
        for(int i=0; i<1; i++){
          stArr=sc.nextLine().split(" ");
        }*/
        for(int i=0; i<4; i++){
            arr[i]=sc.nextInt();
        }
        for(int element: arr){
         sum=sum+element;
        }
      printArray(arr);
    System.out.println("some of all the element of Array: "+sum);
        sc.close();
    }

   public <E> void printArrayGenerics(E[] ar){
      for(int i=0; i<ar.length; i++){
        if(i==0)
         System.out.print("["+ar[i]);
        else
         System.out.print(","+ar[i]);
      }
     System.out.print("]");
    System.out.println();
    }
    public static void printArray(int[] ar){
        for(int i=0; i<ar.length; i++){
            if(i==0)
                System.out.print("["+ar[i]);
            else
                System.out.print(","+ar[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}
