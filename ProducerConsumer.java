package com.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by William on 2017/4/11.
 * 生产者消费者问题.
 */
public class ProducerConsumer<T> {

  static class MsgQueueManager<T> {

    // 消息总队列
    public final BlockingQueue<T> messageQueue;

    MsgQueueManager(BlockingQueue<T> messageQueue) {
      this.messageQueue = messageQueue;
    }

    MsgQueueManager() {
      this.messageQueue = new LinkedBlockingQueue<T>();
    }

    public void put(T msg) {
      try {
        messageQueue.put(msg);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    public T take() {
      try {
        return messageQueue.take();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }

      return null;
    }
  }

  static class Producer extends Thread {

    private MsgQueueManager msgQueueManager;

    public Producer(MsgQueueManager msgQueueManager) {
      this.msgQueueManager = msgQueueManager;
    }

    @Override
    public void run() {
      msgQueueManager.put(new Object());
    }
  }

  static class Consumer extends Thread {

    private MsgQueueManager msgQueueManager;

    public Consumer(MsgQueueManager msgQueueManager) {
      this.msgQueueManager = msgQueueManager;
    }

    @Override
    public void run() {
      Object o = msgQueueManager.take();
    }
  }

  public static void main(String[] args) {
    MsgQueueManager<String> msgQueueManager = new MsgQueueManager<String>();

    for (int i = 0; i < 100; i++) {
      new Producer(msgQueueManager).start();
      System.out.println("Producer:" + i);
    }

    for (int i = 0; i < 100; i++) {
      new Consumer(msgQueueManager).start();
      System.out.println("Consumer:" + i);
    }
  }
}