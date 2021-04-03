package com.java.handson.misc;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        String[] input =new String[sc.nextInt()+2];
        sc.nextLine();
        for(int l=0;l<input.length; l++){
            input[l]=sc.nextLine();
        }
        for(int m=0;m<input.length; m++){
                String[] strInp = input[m+2].split(" ");
                System.out.println(strInp.length);
                //System.out.println("1th element "+strInp[1]);
            int N=input[m+2].split(" ").length;
                int[] countries = new int[N];

                for (int k = 0; k < N; k++) {
                    countries[k] = Integer.parseInt(strInp[k]);
                    System.out.println("country"+k+"th element"+countries[k]);
                }
getHandShake(countries);

            }
        }
static void getHandShake(int[] countries){
    int total = 0;
    int handShakes = 0;
    int temp = 1;
    int handShakesTotal = 0;
    for (int i = 0; i < countries.length; i++) {

        if (i == 0) {
            handShakes = countries[i] * countries[i + 1];
            total = total + countries[i] + countries[i + 1];
            temp = total;
            handShakesTotal = handShakesTotal + handShakes;
        } else {
            handShakes = temp * countries[i + 1];
            total = total + countries[i + 1];
            temp = total;
            handShakesTotal = handShakesTotal + handShakes;
        }
    }
    System.out.println(handShakesTotal);
}
}
