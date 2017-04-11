package com.test;

/**
 * 快速排序算法。
 * Created by William on 2017/4/11.
 */
public class QuickSort {

  // 快速排序
  public static void funQuickSort(int[] mdata, int start, int end) {
    if (end > start) {
      int pivotIndex = quickSortPartition(mdata, start, end);
      funQuickSort(mdata, start, pivotIndex - 1);
      funQuickSort(mdata, pivotIndex + 1, end);
    }
  }

  // 快速排序前的划分
  public static int quickSortPartition(int[] list, int first, int last) {
    int pivot = list[first];
    int low = first + 1;
    int high = last;

    while (high > low) {
      while (low <= high && list[low] <= pivot) {
        low++;
      }

      while (low <= high && list[high] > pivot) {
        high--;
      }

      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot) {
      high--;
    }

    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    } else {
      return first;
    }
  }

  public static void main(String[] args) {
    int[] num = {1, 3, 4, 6, 2, 8, 9, 0};

    funQuickSort(num, 0, num.length - 1);

    int len = num.length;
    for (int i = 0; i < len; i++) {
      System.out.print(num[i] + " ");
    }
  }
}