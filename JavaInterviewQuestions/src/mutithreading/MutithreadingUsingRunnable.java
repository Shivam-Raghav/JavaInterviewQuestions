package mutithreading;

public class MutithreadingUsingRunnable implements Runnable
{
public void run() {
	try {
		System.out.println("Thread " + Thread.currentThread());
	}
	catch(Exception e) {
		System.out.println("Exception is caught");
	}
}
	public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		Thread obj=new Thread(new MutithreadingUsingRunnable());
		obj.start();
	}

	}

}
