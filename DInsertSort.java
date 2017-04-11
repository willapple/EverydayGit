package com.test;

/**
 * 直接插入排序算法。
 * Created by William on 2017/4/11.
 */
public class DInsertSort {

  // 直接插入排序
  public static void funDInsertSort(int[] array) {
    int j;

    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      j = i - 1;

      while (j > -1 && temp < array[j]) {
        array[j + 1] = array[j];
        j--;
      }

      array[j + 1] = temp;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] num = {1, 3, 4, 6, 2, 8, 9, 0};
    funDInsertSort(num);
  }
}