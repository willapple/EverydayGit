package com.test;

/**
 * 冒泡排序算法。
 * Created by William on 2017/4/11.
 */
public class BubbleSort {

  // 冒泡排序 注意 flag 的作用
  public static void funBubbleSort(int[] array) {
    boolean flag = true;

    for (int i = 0; i < array.length - 1 && flag; i++) {
      flag = false;

      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

          flag = true;
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    int[] num = {1,3,4,6,2,8,9,0};
    funBubbleSort(num);
  }
}