package module001.question04;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int prev = 1;
		int current = 1;
		int temp=0;
		
		while (true) {
			prev = 1;
			current = 1;
			temp = 0;
			System.out.println("Enter the number : ");
			number = Integer.parseInt(sc.nextLine());
			if(number >= 1) {
				System.out.print(prev + " ");
				number--;
			}
			
			if(number >= 1) {
				System.out.print(current+ " ");
				number--;
			}

			for(;number>0;) {	
				temp = current + prev;										
				System.out.print(temp+ " ");
				prev = current;
				current=temp;				
				number--;
			}
			
			
			System.out.println("\nDo you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}


}
