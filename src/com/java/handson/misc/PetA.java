package com.java.handson.misc;

public class PetA {

    public static void main(String[] args) {

        PetA p=new PetA();
        p.start();
        //System.out.println(12%0);

    }
    void start(){
  long[] a1={3,4,5};
  long[] a2=fix(a1);
        System.out.print(a1[0]+a1[1]+a1[2]+" ");
        System.out.println(a2[0]+a2[1]+a2[2]);
    }

    long[] fix(long[] a3){
        a3[1]=7;
        return a3;
    }
}
