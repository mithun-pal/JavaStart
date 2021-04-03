package com.java.handson.misc;
import java.util.Scanner;
import java.math.BigInteger;
public class CodeChef1 {
  public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("how many numbers");
      int input=sc.nextInt();
      for(int j=1; j<=input; j++) {
       System.out.println("input "+j);
       int num=sc.nextInt();
       System.out.println("Factorial of "+num+" -> "+factorial(num));
      }
      sc.close();
    }
   static BigInteger factorial (int num){
        BigInteger result = BigInteger.ONE;
        for(int i=2; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
