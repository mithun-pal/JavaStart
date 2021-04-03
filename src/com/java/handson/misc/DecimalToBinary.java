package com.java.handson.misc;
import java.util.Scanner;
public class DecimalToBinary {
    private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int n = scanner.nextInt();
            int remainder=0;
            int count=1,j,max=1;
            String binary="";
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            while(n!=0){
                remainder=n%2;
                n=n/2;
                binary=binary+remainder;
            }
            char[] binArr=binary.toCharArray();

            for(int i=binArr.length-1;i>=0;i--){
                System.out.print(binArr[i]);
            }
            System.out.println();
            for(int i=0; i<=binArr.length-1;i++){
                if(binArr[i]=='1')
                {
                    System.out.println("value of i: "+i);
                    for(j=i+1;j<=binArr.length-1;j++) {
                        if(binArr[j]=='1'){
                            count=count+1;
                            System.out.println("value of j: "+j);
                            System.out.println("Value of count :"+count);
                        }
                        else
                            break;
                        if(count>max)
                            max=count;
                    }
                }
                else
                    continue;
                i=j;
                count=1;
            }
            System.out.println(max);

            scanner.close();
        }
    }
