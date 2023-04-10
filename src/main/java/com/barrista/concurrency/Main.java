package com.barrista.concurrency;

public class Main {

  public static void main(String[] args) {
    // Test 1
    Thread myThread = new MyThread();
    myThread.start();
  }

}
