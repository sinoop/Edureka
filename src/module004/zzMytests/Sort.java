package module004.zzMytests;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
	public static void main(String[] args) {
		HashMap<String,String> props = new HashMap<>();

		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		Set<String> s = props.keySet();
		s = new TreeSet<String>(s);
		System.out.println(s);
		
		
	}
}
