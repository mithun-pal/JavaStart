package com.java.handson.misc;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
   static BigInteger factorial(int num){
     BigInteger result=new BigInteger("1");
     //BigInteger result= BigInteger.ONE;

       for(int i=2; i<=num; i++){
        result  = result.multiply(BigInteger.valueOf(i));
       }
       return result;

    }
    public static void main(String[] args){
        int num = new Scanner(System.in).nextInt();
        System.out.println(factorial(num));
    }
}
