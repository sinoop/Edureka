package module001.question04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhileLoopTenOddEven {
	static final int COUNT = 10;
	static final int LIMIT = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		ArrayList<Integer> oddList;
		ArrayList<Integer> evenList;

		while (true) {
			oddList = new ArrayList<Integer>();
			evenList = new ArrayList<Integer>();
			while (oddList.size() < WhileLoopTenOddEven.COUNT || evenList.size() < WhileLoopTenOddEven.COUNT) {
				int number = r.nextInt(WhileLoopTenOddEven.LIMIT);
				if (number % 2 == 0) {
					evenList.add(number);
				} else {
					oddList.add(number);
				}
			}
			
			System.out.println("Odd List is " + oddList.subList(0, 9).toString());
			System.out.println("Even List is " + evenList.subList(0, 9).toString());

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}
}
