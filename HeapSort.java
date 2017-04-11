package com.test;

import java.util.Arrays;

/**
 * 堆排序算法。
 * Created by William on 2017/4/11.
 */
public class HeapSort {

  // 堆排序
  public static void heapsort(int arr[], int n) {
    // 先建大顶堆
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapAdjust(arr, i, n);
    }

    for (int i = 0; i < n - 1; i++) {
      swap(arr, 0, n - i - 1);
      heapAdjust(arr, 0, n - i - 1);
    }
  }

  // 交换两个数
  public static void swap(int arr[], int low, int high) {
    int temp = arr[low];
    arr[low] = arr[high];
    arr[high] = temp;
  }

  // 调整堆
  public static void heapAdjust(int arr[], int index, int n) {
    int temp = arr[index];
    int child = 0;

    while (index * 2 + 1 < n) {
      child = index * 2 + 1;

      // child为左右孩子中较大的那个
      if (child != n - 1 && arr[child] < arr[child + 1]) {
        child++;
      }

      // 如果指定节点大于较大的孩子 不需要调整
      if (temp > arr[child]) {
        break;
      } else {
        // 否则继续往下判断孩子的孩子 直到找到合适的位置
        arr[index] = arr[child];
        index = child;
      }
    }

    arr[index] = temp;
  }

  public static void main(String[] args) {
    int[] num = {1, 3, 4, 6, 2, 8, 9};

    heapsort(num, 6);

    System.out.println(Arrays.toString(num));
  }
}