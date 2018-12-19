package module001.question01;

public class FirstExercise {
	public static void main(String[] args) {
		int aNumber=20;
		String aString="Intial Value";
		float aFloat=0.0f;
		double aDouble = 0.0d;
		byte aByte=1;
		char aChar = 'c';
		long aLong =20l;
		
		
		System.out.println("aNumber      = " + (aNumber));
		System.out.println("aNumber+1    = " + (aNumber+1));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aNumber-1    = " + (aNumber-1));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aNumber*2    = " + (aNumber*2));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aNumber/2    = " + (aNumber/2));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aNumber++    = " + (aNumber++));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aNumber--    = " + (aNumber--));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("++aNumber    = " + (++aNumber));
		System.out.println("aNumber      = " + (aNumber));
		                                 
		System.out.println("aFloat-1.2   = " + (aFloat-1.2));
		System.out.println("aFloat+1.2   = " + (aFloat+1.2));
		                                 
		System.out.println("aDouble-1.2  = " + (aDouble-1.2));
		System.out.println("aDouble+1.2  = " + (aDouble+1.2));
		
		System.out.println("aChar        = " + (aChar));
		System.out.println("aChar+'A'    = " + (aChar+'A'));
		
		System.out.println("aByte        = " + (aByte));
		System.out.println("aByte+1      = " + (aByte+1));
		
		System.out.println("aLong        = " + (aLong));
		System.out.println("aLong+1      = " + (aLong+1));
		                                 
		System.out.println("aString      = " + aString+" new Value");
	}
}
