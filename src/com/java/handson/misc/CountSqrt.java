package com.java.handson.misc;

public class CountSqrt {
    public static int solution(int A, int B) {
        // write your code in Java SE 8
        int tmp=0;
        int count=0;
        for(double i =A; i<=B; i++){
            double num=i;
            while(isSqr(num)){
                System.out.println("inside while loop for i "+i);
                tmp++;
                num=Math.sqrt(num);
            }

            if(tmp>count)
                count=tmp;

            tmp=0;
        }
        return count;
    }

    public static boolean isSqr(double a){
        double ch=Math.sqrt(a);
        return ((ch - Math.floor(ch))==0);
    }

    public static void main(String[] args){
        System.out.println(solution(6000,7000));
        System.out.println(Math.sqrt(810));
        System.out.println(Math.ceil(Math.sqrt(810)));
    }

}
