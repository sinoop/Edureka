package module005_Collections.collections;

import java.util.HashMap;

import module005_Collections.common.model.Employee;

public class HashMapAssignmant {
	HashMap<String, Employee> map;

	/**
	 * @param map
	 */
	public HashMapAssignmant() {
		super();
		this.map = new HashMap<>();
	}

	public void additemToMap(String key, Employee value) {
		this.map.put(key, value);
	}
	
	public void display() {		
		for(String key : map.keySet()) {
			System.out.printf("%s -> %s\n",key , this.map.get(key));
		}		
	}

}
