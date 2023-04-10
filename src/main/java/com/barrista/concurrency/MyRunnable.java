package com.barrista.concurrency;

public class MyRunnable implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println("Wait for " + (3 - i) + " more seconds...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Finished.");
  }
}
