package module005_Collections.collections;

import java.util.ArrayList;

public class ArrayListAssignment<T> {
	ArrayList<T> arr;

	/**
	 * @param arr
	 */
	public ArrayListAssignment() {
		super();
		this.arr = new ArrayList<T>();
	}

	public void additem(T item) {
		arr.add(item);
//		System.out.println("Added " + item + " ; Current Size is " + arr.size());
	}
	
	public void display() {
		for(T item : arr) {
			System.out.println(item + " ");
		}
	}

}
