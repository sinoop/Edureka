package module001.question05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopTenOddEven {
	static final int COUNT = 10;
	static final int LIMIT = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		ArrayList<Integer> oddList;
		ArrayList<Integer> evenList;

		do {
			oddList = new ArrayList<Integer>();
			evenList = new ArrayList<Integer>();
			do {
				int number = r.nextInt(DoWhileLoopTenOddEven.LIMIT);
				if (number % 2 == 0) {
					evenList.add(number);
				} else {
					oddList.add(number);
				}
			} while (oddList.size() < DoWhileLoopTenOddEven.COUNT || evenList.size() < DoWhileLoopTenOddEven.COUNT);

			System.out.println("Odd List is " + oddList.subList(0, 9).toString());
			System.out.println("Even List is " + evenList.subList(0, 9).toString());

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		} while (true);
	}
}
