package Stack;

import java.util.Stack;

public class Test {
public static void main(String[] args) {
	Stack s1 = new Stack ();
	s1.push(false);
	s1.add(34);
	s1.push("ok");
	s1.push('f');
	System.out.println(s1);
	s1.pop();
	System.out.println(s1);
	System.out.println(s1.search("ok"));
	System.out.println(s1.isEmpty());
	System.out.println(s1.peek());
}
}
