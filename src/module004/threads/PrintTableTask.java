package module004.threads;

public class PrintTableTask implements Runnable {
	private int number;

	/**
	 * @param number
	 */
	public PrintTableTask(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " x " + this.number + " = " + (i * this.number));
		}
	}

}
