package com.esanchez.devel.threads;

public class ThreadInterrupted {

	public static void main(String[] args) {
		// Test to check that when we interrupt the main thread of the application
		// the application continues. But it's a good practice to re-interrupt the thread 
		// when a InterruptedException is catched.
		for (int i=0; i<19; i++) {
			
			if (i == 11) {
				System.out.println("Interrupting the current thread");
				try {
					throw new InterruptedException();
				} catch (InterruptedException e) {
					System.out.println("Current thread interrupted");
					Thread.currentThread().interrupt();
					// After interrupt the current thread, the application continues and the thread didn't die
				}
			}
			
			System.out.println("Iteration: " + i);
		}
	}
}
