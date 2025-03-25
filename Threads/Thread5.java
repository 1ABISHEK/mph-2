package com.mph.Threads;

public class Thread5 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			public void run() {
				System.out.print("bar");
			}
		}).start();
	}

}
