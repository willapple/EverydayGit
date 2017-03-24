package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author William
 *
 */
public class WordCount {

  public static void main(String[] args) throws Exception {
    String path = "d:\\test.txt";
    int countChar = 0;
    int countword = 0;
    int countline = 0;
    InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
    BufferedReader br = new BufferedReader(isr);// 使用缓冲区，可以使用缓冲区的read(),readLine()方法；
    /*
     * readLine每次读取一行，read()读取整个文件，是生成文件内容最直接的方式，如果连续面向行的处理则是没有必要的 可直接综合为
     * BufferedReader br = new BufferedReader(new InputStreamReader(new
     * FileInputStream(path)));
     */
    int str;
    while ((str=br.read()) != -1)// read()=-1代表数据读取完毕
    //while (br.read() != -1)// read()=-1代表数据读取完毕
    {
      String s = br.readLine();
      
      System.out.println("每行的字符串："+(char)str+s); // 用于解决读取每行的时候首字母消失的情况
      countChar += s.length();// 字符个数就是字符长度
      
      if(!s.isEmpty()){
        countword += s.split(" ").length;// split()
        // 方法用于把一个字符串分割成字符串数组,字符串数组的长度，就是单词个数
      }
      countline++;// 因为是按行读取，所以每次增加一即可计算出行的数目
    }
    isr.close();// 关闭文件
    System.out.println("字符数：" + countChar);
    System.out.println("单词数： " + countword);
    System.out.println("行数：" + countline);
  }
}
