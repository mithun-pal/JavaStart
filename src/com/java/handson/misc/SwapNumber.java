package com.java.handson.misc;

public class SwapNumber {
    public static void main(String[] args){
        int x=34;
        int y=56;
        System.out.println("Before swapping : X="+ x +" and Y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping : X="+ x + " and Y="+y);

    }
}
