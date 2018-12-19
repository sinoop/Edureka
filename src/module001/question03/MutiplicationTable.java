package module001.question03;

import java.util.Scanner;

public class MutiplicationTable {
	static final int LIMIT = 20;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0;
		int loopVariable = 1;
		while (true) {
			System.out.println("Enter the number : ");
			number = Integer.parseInt(sc.nextLine());
			loopVariable = 1;
			for(;loopVariable <= MutiplicationTable.LIMIT;) {
				System.out.printf("%5d x %5d = %10d\n",number,loopVariable,number* loopVariable);
				loopVariable++;
			}
			
			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}
}
