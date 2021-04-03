package com.java.handson.misc;

import java.util.*;
import java.util.Map.Entry;

public class Misc {
    public static void main(String[] args){
        int dividend=83%5;
Map<Integer,Integer> birds=new HashMap<Integer,Integer>();
        System.out.println(16/3);

        List<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4));
        int frequency=1;
        int maxFr=1;
        int minKy=2*(int)Math.pow(10,5);
        for(int i=0; i<arr.size(); i++){
            if(birds.containsKey(arr.get(i))){
                int occurence=birds.get(arr.get(i))+1;
                birds.put(arr.get(i),occurence);
            }
            else
                birds.put(arr.get(i),frequency);
        }
        System.out.println(birds);
        System.out.println(minKy);
        for(Entry entry: birds.entrySet()){
          if((int)entry.getValue() > maxFr ) {

              maxFr = (int) entry.getValue();
              minKy = (int) entry.getKey();
              //System.out.println("value " + maxFr + " " + "Key " + minKy);
          }
          else if((int)entry.getValue() == maxFr){
            if((int)entry.getKey() < minKy){
                maxFr = (int) entry.getValue();
                minKy = (int) entry.getKey();
            }
          }
        }
        System.out.println(minKy);

    }
}
