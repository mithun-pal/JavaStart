package com.java.release.eight;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
      Consumer<String> c= (s) -> System.out.println(s);
      c.accept("Hello");
        Supplier s=()->{
          String[] str={"Apple","Orange","Watermelon","Banana"};
          int i=(int)(Math.random()*3+1);
          return str[i];
        };
        System.out.println(s.get());
    }
}
