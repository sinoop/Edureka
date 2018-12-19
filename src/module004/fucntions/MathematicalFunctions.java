package module004.fucntions;

public class MathematicalFunctions {
	public static double substract(double firstNum, double secondNumber) {
		return firstNum - secondNumber;
	}

	public static double add(double firstNum, double secondNumber) {
		return firstNum + secondNumber;
	}

	public static double divide(double firstNum, double secondNumber) {
		return firstNum / secondNumber;
	}

	public static double multiply(double firstNum, double secondNumber) {
		return firstNum * secondNumber;
	}

	public static long factorial(long number) {
		long result = 1l;
		int numberloop = (int) number;
		for (; numberloop > 0;) {
			result *= (numberloop--);
		}
		return result;
	}

	public static int reverseNumber(Integer number) {
		String numberAsString = "";
		String reverseString = "";
		String[] stringArray = null;
		
		numberAsString = number.toString();
		stringArray = numberAsString.split("");
		reverseString = "";
		for (String a : stringArray) {
			reverseString = (a + reverseString);
		}
		return Integer.parseInt(reverseString);
	}
}
