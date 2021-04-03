package com.java.handson.misc;

import java.util.Scanner;

public class TwoDArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    /*
sample input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

     */

        int[][] twoDArr = new int[6][6];
        //Inserting into Array
        for (int i = 0; i < 6; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int item = Integer.parseInt(row[j]);
                twoDArr[i][j] = item;
            }
        }
        //For displaying the Array
        /*for (int k = 0; k < 6; k++) {
            for (int l = 0; l < 6; l++) {
                System.out.print(twoDArr[k][l] + " ");
            }
            System.out.println();
            k=k+3;
        }*/

int sum=0,inr=0;
        /*for (int h = 0; h < 6-2; h++) {
            for(inr=h;inr<h+3; inr++){
              sum=sum+twoDArr[h][inr]+twoDArr[h+2][inr];
            }
            sum=sum+twoDArr[h+1][h+3/2];
            for(int v=h+1;v<6-2; v++) {
                sum = sum + twoDArr[h + 1][inr];
            }*/
        int k=0;
for(int h=0;h<6-2;h++) {
    for (k = h; k < h+3; k++) {
        sum=sum+twoDArr[h][k];


    }
    sum=sum+twoDArr[h+1][h+2/2];


}
            System.out.println(3/2);

        }
    }

