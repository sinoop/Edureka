package module004.zzMytests;

public class Threads2 implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run.");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Threads2());
		t.start();
		System.out.println("End of method.");
	}
}
