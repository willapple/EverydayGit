package com.test;

/**
 * 二分查找算法，针对有序的数组进行排序。
 * Created by William on 2017/4/11.
 */
public class BinSearch {

  public static int funBinSearch(int[] array, int data) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (data == array[mid]) {
        return mid;
      } else if (data < array[mid]) {
        high = mid -1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] num = {1,2,3,4,5,6,7,8,9};
    int s = BinSearch.funBinSearch(num, 8);
    System.out.println("s = " + s);
  }
}