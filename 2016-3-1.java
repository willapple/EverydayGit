package com;
/**
 * 用Java编写简单的冒泡排序
 * @author William
 *
 */
public class Test {
	public static void main(String[] args) {
		sort();
	}
	
	public static void sort(){
		int num[]={10,5,2,7,9,15,18,3};
		int len = num.length;
		int temp = 0;
		for (int i=0; i<len; i++){
			for (int j=0; j<len-i-1; j++){
				if (num[j] > num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<len; i++){
			System.out.println(num[i]);
		}
	}
}
