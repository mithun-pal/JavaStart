package com.java.handson.misc;

public class BinarySearch {
  public static void main(String[] args){
      int[] numbers=new int[]{90,23,101,45,65,23,67,89,34,23};
      MergeSort sorting=new MergeSort();
      sorting.splitArray(numbers,0,numbers.length-1);
      BinarySearch binary=new BinarySearch();
      int position= binary.search(numbers,101);
      System.out.println("Found at "+position+" place");
  }

  int search(int[] arr,int elem){
    int start=0;
    int end=arr.length-1;


    while(start<=end){
    int mid=(start+end)/2;
      if(arr[mid] == elem)
        return mid;
     else if(arr[mid] > elem)
       end=mid-1;
     else
       start=mid+1;

    }
    return -1;
  }

}
