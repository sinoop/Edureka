package module004.zzMytests;

public class StaticTest {
	// int n = getValue();
	static int n = getValue();
	static {
		System.out.println("Inside static block-1");
	}

	public static void main(String[] args) {
		System.out.println("Inside MAIN method");
//		StaticTest obj = new StaticTest();
	}

	static {
		System.out.println("Inside static block-2");
	}

	static int getValue() {
		System.out.println("Inside getValue method");
		return 10;
	}
}
