package com.barrista.concurrency;

public class Main {

  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
  }

  private static void test3() {
    Runnable runnable = () -> {
      System.out.println("This is runnable object instantiated using a lambda expression");
      sleep(1500);
      System.out.println("Test 3 finished.");
    };
    Thread thread = new Thread(runnable);
    thread.start();
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

  private static void sleep(long milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
