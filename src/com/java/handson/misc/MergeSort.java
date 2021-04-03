package com.java.handson.misc;

public class MergeSort {
  public static void main(String[] args){
    int[] numbers=new int[]{90,23,101,45,65,23,67,89,34,23};
    MergeSort mSort=new MergeSort();
      System.out.println("---before sort---");
    mSort.printArray(numbers);
      System.out.println();
      System.out.println("---after sort---");
    mSort.splitArray(numbers,0,numbers.length-1);
    mSort.printArray(numbers);

  }

  void mergeArray(int[] ar, int beg,int mid,int last){
    int left=mid-beg+1;
    int right=last-mid;
    int[] leftArr=new int[left];
    int[] rightArr=new int[right];
   for(int l=0; l<left; l++){
     leftArr[l]=ar[beg+l];
   }
      for(int r=0; r<right; r++){
          rightArr[r]=ar[mid+1+r];
      }
   int i=0,j=0;
   int k=beg;

   while(i<left && j<right){
    if(leftArr[i] <= rightArr[j]){
     ar[k]=leftArr[i];
     i++;
     }
    else{
      ar[k]=rightArr[j];
      j++;
    }
    k++;
   }
while(i<left){
 ar[k]=leftArr[i];
 i++;
 k++;
}
while(j<right){
 ar[k]=rightArr[j];
 j++;
 k++;
}

  }

  void splitArray(int[] arr, int start,int end){
   if(start<end) {
       int mid = (start+end) / 2;
       splitArray(arr, start, mid);
       splitArray(arr, mid + 1, end);
       mergeArray(arr, start, mid, end);
   }
  }
  void printArray(int[] arr){
    for(int i=0; i<arr.length; i++){
     if(i==0)
      System.out.print("["+arr[i]);
     else
      System.out.print(" "+arr[i]);

    }
    System.out.print("]");
  }
}
