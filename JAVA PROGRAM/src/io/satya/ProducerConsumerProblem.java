package io.satya;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerProblem {

	static List<Integer> list = new ArrayList<Integer>();

	final static Object object = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		t1.setName("SATYA");
		t2.setName("TANIMA");
		t1.start();
		Thread.sleep(1000);
		t2.start();

	}

	static void producer() throws InterruptedException {

		Random random = new Random();

		synchronized (object) {

			System.out.println("Thread name in producer is " + Thread.currentThread().getName());
			while (list.size() < 20) {
				Thread.sleep(500);
				int value = random.nextInt(100);
				list.add(value);
				System.out.println("producer prodoced :: "+value+" list size is no "+ list.size());
				if(list.size()>=18){
					object.notifyAll();
					object.wait();
				}
			}
		}
	}
	static void consumer() throws InterruptedException {
		System.out.println("Thread name in Consumer is " + Thread.currentThread().getName());
		synchronized (object) {
			while (list.size() > 1) {
				Thread.sleep(500);
				Integer remove = list.remove(0);
				System.out.println("consumer consumed :: "+ remove+ "list size is now "+list.size());
				if(list.size()<=1){
					object.notifyAll();
					object.wait();
				}
			}
		}

	}

}
