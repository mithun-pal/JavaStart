package com.java.handson.misc;

public class removeArrayDuplicate {

  public static void main(String[] args){
      int arr[] = {10,5,2,3,5,1,2,12,10};
      int length = arr.length;
      length = removeDuplicate(arr, length);
      //printing array elements
      for (int i=0; i<length; i++) {
          System.out.print(arr[i] + " ");
      }
  }



    public static int removeDuplicate(int arr[], int n){
        if(n ==0 || n==1){
            return n;
        }
        int j=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
    }
}
