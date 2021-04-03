package com.java.handson.misc;
import java.util.Arrays;
import static java.lang.Math.abs;

public class MissingInteger {

    public static void solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int diff=2147483647;
        int pos=A.length;
        for(int i=0; i<A.length-1; i++){
            //[1, 1, 2, 3, 4, 6]
            int tmp=abs(A[i]-A[i+1]);

            if(tmp>1 && tmp<=diff && i<pos){
                System.out.println("inside if condition for i value "+i);
                diff=tmp;
                pos=i;

            }

        }

       // System.out.println(abs(A[pos]+A[pos+1])/2);
        System.out.println( (A[pos]+1==0)? A[pos]+2: A[pos]+1  );


    }
   public static void main(String[] args){
       solution(new int[]{2});

    }

 }



