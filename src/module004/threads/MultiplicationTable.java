package module004.threads;

public class MultiplicationTable {

	public static void main(String[] args) {
//		ThreadGroup t = new ThreadGroup("Temp");

		Thread t1 = new Thread(new PrintTableTask(10));
		t1.start();

		for (int i = 0; i < 20; i++) {
			System.out.println(i * 2);
		}

	}
}
