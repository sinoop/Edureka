package module004.main;

import java.util.ArrayList;
import java.util.List;

import module004.interfaces.Queue;

public class QueueImpl<T> implements Queue<T> {
	private List<T> array;
	private int currentSize;

	QueueImpl() {
		array = new ArrayList<>();
		currentSize = 0;
	}

	@Override
	public void insert(T t) {
		array.add(t);
		currentSize++;
//		System.out.println("Inserted " + t + " | Size : " + currentSize);		
	}

	@Override
	public T delete() {
		if (currentSize > 0) {
			T item = array.get(0);
			if (currentSize == 1) {
				array = new ArrayList<>();
			} else {
				array = array.subList(1, currentSize);
			}
			currentSize--;
//			System.out.println("Deleted " + item + " | Size : " + currentSize);
			return item;
		} else {
			throw new ArrayIndexOutOfBoundsException("No Elements to delete");
		}

	}

}
