package io.satya;

public class PrintEvenOdd {

	public static void main(String[] args) throws InterruptedException {
		print print = new print();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					print.odd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					print.even();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t1.setName("T1");
		t1.start();
		t2.setName("T2");
		t2.start();
	}
}

class print {

	private static final int LIMIT = 10;
	private volatile boolean isOdd = true;
	private 
	
	int count = 1;

	public synchronized void odd() throws InterruptedException {

		while (count < LIMIT) {
			
			if (!isOdd) {
				this.wait();
			}

			System.out.println(count++ + " Thread is " + Thread.currentThread().getName());
			isOdd = false;
			notify();
		}
	}

	public synchronized void even() throws InterruptedException {
		while (count < LIMIT) {
			if (isOdd) {
				this.wait();
			}

			System.out.println(count++ + " Thread is " + Thread.currentThread().getName());
			isOdd = true;
			notify();
		}
	}
}