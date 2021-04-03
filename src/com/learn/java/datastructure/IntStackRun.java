package com.learn.java.datastructure;
import java.util.Random;

public class IntStackRun {

  public static void main(String[] args){
  Random random = new Random();
  int value;
  IntStack intstack = new IntStack(8);
   System.out.println("Length of the Stack: "+intstack.length());
    for (int i=0; i<intstack.length(); i++){
       value = random.nextInt(100);
      intstack.push(value);
    }
    //System.out.println("Is Stack empty: "+intstack.isEmpty());
    //System.out.println("Is Stack full: "+intstack.isFull());
   System.out.println("Started popping up the items - ");

    try {
        for (int i = 0; i < 10; i++) {
            System.out.println(intstack.pop());
        }
     }
     catch (EmptyStackException e){
         e.printStackTrace();
      }


  }
}
