package collectio;

import java.util.PriorityQueue;

public class Test7 {
public static void main(String[] args) {
	PriorityQueue q1 = new PriorityQueue<>();
	q1.offer(10);
	q1.offer(78);
	q1.add(45);
	q1.add(56);
	System.out.println(q1);
	q1.poll();
	System.out.println(q1);
	q1.poll();
	System.out.println(q1);
}
}
