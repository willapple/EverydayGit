package com;

/**
 * java split 函数的用法
 * @author William
 *
 */
public class Test {
	public static void main(String[] args) {
		String[] s = ("one two three four five six seven eight nine ten").split(" ");
		for (int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}
	
}