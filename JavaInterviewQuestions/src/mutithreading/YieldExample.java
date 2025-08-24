package mutithreading;

public class YieldExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control ");
		}
	}

	public static void main(String[] args) {
		YieldExample t = new YieldExample();
		t.start();
		for (int i = 0; i < 5; i++) {
			Thread.yield();

			System.out.println(Thread.currentThread().getName() + " in control");
		}

	}

}
