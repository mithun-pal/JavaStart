package com.java.handson.misc;

import java.util.HashMap;

public class ArrayDemo {

  ArrayDemo(){
   System.out.println("Constructor called");
  }

  static int a=10;
   float f;
   static{
     System.out.println("static value of a: "+a);
   }


    public static void main(String[] args){
      int[] arr=new int[5];
      HashMap phonebook=new HashMap();
      phonebook.put("sam",99912222);
        phonebook.get("sam");

      System.out.println(phonebook.get("sam"));
        for(int i=0; i<arr.length;i++){

        }
      String name="Mithun";
      name.toCharArray();
      int no=231;
      //System.out.println(99/100);
      ArrayDemo d1 = new ArrayDemo();
      ArrayDemo d2 = new ArrayDemo();
      

    }
}
