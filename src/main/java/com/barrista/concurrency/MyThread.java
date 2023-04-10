package com.barrista.concurrency;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("This thread is a subclass of the Thread class.");
    System.out.println("Starts sleep for 2 sec.");
    try {
      sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("The thread is finished.");
  }
}
