package com.test;

/**
 * 斐波那契数列: 递归算法。
 * Created by William on 2017/4/11.
 */
public class Fibonacci {

  //斐波那契数列 递归实现
  public static long funFib(long index) {

    if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      return funFib(index - 1) + funFib(index - 2);
    }
  }

  // 求斐波那契数列的另一种方式，效率比递归方法的效率高。
  public static long funFib2(long index) {
    long f0 = 0;
    long f1 = 1;
    long f2 = 1;

    if (index == 0) {
      return f0;
    } else if (index == 1) {
      return f1;
    } else if (index == 2) {
      return f2;
    }

    for (int i = 3; i <= index; i++) {
      f0 = f1;
      f1 = f2;
      f2 = f0 + f1;
    }

    return f2;
  }
  public static void main(String[] args) {
    long num = 10L;
    long sum = 0L;

    for (int i = 0; i < num; i++) {
      sum = funFib(i);
//      sum = funFib2(i);
      System.out.print(sum + " ");
    }
  }
}