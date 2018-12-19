package module004.zzMytests;

import java.util.*;

public class Tests {
	public static void main(String args[]) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings);
		for (String s : strings) {
			System.out.print(s + " ");
		}
	}
}