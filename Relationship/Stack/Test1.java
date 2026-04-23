package Stack;

import java.util.HashSet;

public class Test1 {
public static void main(String[] args) {
	HashSet h1 = new HashSet<>();
	h1.add(23);
	h1.add(false);
	h1.add('f');
	h1.add("Hello");
	h1.add(false);
	h1.add(null);
	h1.add(null);
	System.out.println(h1);
}
}
