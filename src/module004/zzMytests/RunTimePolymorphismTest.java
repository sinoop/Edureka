package module004.zzMytests;

class A {
	void display() {
		System.out.println("Called from Class A");
	}
}

class B extends A{
	void display() {
		System.out.println("Called from class B");
	}
}

public class RunTimePolymorphismTest {
	public static void main(String[] args) {
		A obj = new B();
		obj.display();
	}
	
	
}
