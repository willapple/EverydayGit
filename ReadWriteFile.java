package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadWriteFile {

  /**
   * author: william
   * 
   * @param args
   */
  public static void main(String[] args) {
    try {
      writeFile();  
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      readFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * 写文件到D盘，并写入数据。
   * @throws IOException
   */
  public static void writeFile() throws IOException {
    String str = "this is a test file...";
    OutputStream os = null;
    os = new FileOutputStream("d:\\test.txt");
    os.write(str.getBytes());
    os.close();
  }

  /**
   * 读取文件中的内容。
   * @throws IOException
   */
  public static void readFile() throws IOException {
    InputStream is = null;
    try {
      is = new FileInputStream("d:\\test.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    byte bs[] = new byte[is.available()]; 
    is.read(bs);
    System.out.println(new String(bs));
    is.close();
  }
}
