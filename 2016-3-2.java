package com;
/**
 * 用Java编写简单的快速排序算法
 * @author William
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] num = {10,5,2,7,9,15,18,3};
		int len = num.length;
		quicksort(num, 0, len-1);
		for (int i = 0; i < len; i++) {
			System.out.println(num[i]);
		}
	}
	
	static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }
	
	static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
}