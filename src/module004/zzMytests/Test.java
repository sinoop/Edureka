package module004.zzMytests;

class OuterClass {
	int x = 100;

	class InnerClass {
		int y = 200;

		void display() {
			System.out.println(x + y);
		}
	}
}

public class Test {
	public static void main(String args[]) {
		OuterClass o1 = new OuterClass();
		OuterClass.InnerClass i1 = o1.new InnerClass();
		i1.display();
	}
}