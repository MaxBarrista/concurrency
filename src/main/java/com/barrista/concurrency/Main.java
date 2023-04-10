package com.barrista.concurrency;

public class Main {

  public static void main(String[] args) {
    // test1();
    test2();
  }

  private static void test2() {
    Runnable myRunnable = new MyRunnable();
    Thread myThread = new Thread(myRunnable);
    myThread.start();
  }

  public static void test1() {
    Thread myThread = new MyThread();
    myThread.start();
  }

}
