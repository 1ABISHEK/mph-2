package com.mph.Threads;

class ThreadA extends Thread {
	public synchronized void print1_5() {
		System.out.println("Run Started");
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("i+  " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Runs End");
	}
}

class ThreadC extends Thread {
	ThreadA ta;

	public ThreadC(ThreadA ta) {
		this.ta = ta;
	}

	public void run() {
		ta.print1_5();
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		ThreadA ta1 = new ThreadA();
		ThreadC tc1 = new ThreadC(ta1);
		tc1.start();
		ThreadC tc2 = new ThreadC(ta1);
		tc2.start();
		System.out.println("Main Ends");

	}

}
