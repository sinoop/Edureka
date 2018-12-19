package module004.main;

import module004.fucntions.MathematicalFunctions;

public class MainClass {
	public static void main(String[] args) {
		QueueImpl<String> q = new QueueImpl<>();
		q.insert("Test");
		q.insert("Test 2 ");
		q.insert("Test 3 ");
		
		q.delete();
		q.delete();
		q.delete();
		
		QueueImpl<Integer> q2 = new QueueImpl<>();
		q2.insert(1);
		q2.insert(2);
		q2.insert(3);
		System.out.println(q2.delete());
		System.out.println(q2.delete());
		System.out.println(q2.delete()); 
		
		System.out.println(MathematicalFunctions.add(1.2, 2.3));
		System.out.println(MathematicalFunctions.substract(1.2, 2.3));
		System.out.println(MathematicalFunctions.divide(1.2, 2.3));
		System.out.println(MathematicalFunctions.multiply(1.2, 2.3));
		System.out.println(MathematicalFunctions.factorial(12));
		System.out.println(MathematicalFunctions.reverseNumber(12341234));
	}
}
