package module005_Collections.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import module005_Collections.common.model.Student;

public class HashTableAssignment {
	Hashtable<String, Student> tb;

	/**
	 * @param tb
	 */
	public HashTableAssignment() {
		super();
		this.tb = new Hashtable<>();
	}

	public void addEntry(String key, Student value) {
		tb.put(key, value);
	}

	public void display() {		
		for (String key : tb.keySet()) {
			System.out.printf("%s -> %s\n", key, this.tb.get(key));
		}
	}

	public void displayCurrentTopper() {
		Set<Entry<String, Student>> st = tb.entrySet();
		Iterator<Entry<String, Student>> it = st.iterator();
		Student highest = null;

		while (it.hasNext()) {
			if (highest == null) {
				highest = it.next().getValue();
			} else {
				if (it.next().getValue().compareTo(highest) > 0) {
					highest = it.next().getValue();
				}
			}
		}
		if (highest != null)
			System.out.println("Current Topper is " + highest);
		else
			throw new NullPointerException("Student not inserted");
	}

}
