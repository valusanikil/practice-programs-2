package java_programming_for_beginners;

class Task1 extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "  ");
		}
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for (int i = 11; i < 20; i++) {
			System.out.print(i + " ");
		}
	}

}

public class ThreadRunner {
	public static void main(String[] args) {
		
		// task1
		Task1 task1 = new Task1();
		task1.start();
		System.out.println();
		
		// task2
		Task2 task2 = new Task2();
		Thread task2Thread=new Thread(task2);
		task2Thread.start();
		System.out.println();
		
		// task3
		for (int i = 21; i < 30; i++) {
			System.out.print(i + " ");
		}
	}
}
