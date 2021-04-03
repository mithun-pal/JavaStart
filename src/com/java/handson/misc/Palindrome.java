package com.java.handson.misc;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] arg){
   String rev = "";
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a String or number ");

   String entry = input.nextLine();
   int len = entry.length();
   for(int i=len-1; i >= 0; i--){
    rev = rev+entry.charAt(i);
   }
   System.out.println("Reverse String "+rev);
   if(entry.equalsIgnoreCase(rev)){
    System.out.println("Your entry is Palindrome");
   }
   else{
    System.out.println("Your entry is not Palindrome");
   }
  }
}
