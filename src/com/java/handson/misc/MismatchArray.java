package com.java.handson.misc;
import java.util.HashMap;
import java.util.Map;


class MismatchArray {
    /*
    static int[] missingNumbers(int[] arr, int[] brr) {
        String str = "";
        Map<Integer, Integer> mapArr = getOccurance(arr);
        Map<Integer, Integer> mapBrr = getOccurance(brr);
        for (Map.Entry<Integer, Integer> me : mapBrr.entrySet()) {
            if (!mapArr.containsKey(me.getKey())) {
                str = str + me.getKey() + "|";
            } else {
                if (mapArr.get(me.getKey()) != me.getValue()) {
                    str = str + me.getKey() + "|";
                }
            }


        }
    }
    static Map<Integer,Integer> getOccurance(int[] intArr){
        int count=1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<intArr.length; i++){
            for(int j=i+1; j<intArr.length; j++){
                if(intArr[i]==intArr[j]){
                    count++;
                }
            }
            if(!map.containsKey(new Integer(intArr[i])))
                map.put(new Integer(intArr[i]),new Integer(count));

            count=1;
        }

        return map;
    }
    */
}