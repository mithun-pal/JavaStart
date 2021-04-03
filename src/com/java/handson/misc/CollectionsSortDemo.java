package com.java.handson.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Apple");
        l.add("Zebra");
        l.add("Ant");
        l.add("Ball");
        l.add("Bus");
        //l.add(21);
        System.out.println(l);
        //Collections.sort(l);
        Collections.sort(l, new MyComparator());
        System.out.println("After sorting: "+l);
    }

}
class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2) {
        String s1 = (String)obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}



