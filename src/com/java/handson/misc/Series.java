package com.java.handson.misc;
import java.util.Scanner;

public class Series {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int element=a;
            System.out.println();
            for(int k=1;k<=n;k++){
                for(int j=0; j<k; j++){
                    element=element+(int)Math.pow(2,j)*b;
                }
                System.out.print(element+" ");
                element=a;
            }
            //System.out.println();
        }
        in.close();
    }
}
