package module004.zzMytests;

public class PriorityQueue {
	public static void main(String[] args) {
		java.util.PriorityQueue<String> pq = new java.util.PriorityQueue<String>();
		pq.add("carrot");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq.poll() + ":" + pq.peek());
	}
}
