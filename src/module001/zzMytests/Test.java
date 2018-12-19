package module001.zzMytests;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String a = "AAAB";
		System.out.println(Arrays.toString(a.getBytes()));
		System.out.println(Arrays.toString(a.toCharArray()));
//		testLamda2 l2;
		testLamda l = (ab) -> {
//			System.out.println(l2=(ab.toCharArray())->(x.));
		};
		l.display("Test");
	}
}

interface testLamda {
	void display(String a);
}

interface testLamda2 {
	void integer(char[] a);
}