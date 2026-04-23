package collectio;

import java.util.ArrayList;

public class Test5 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList <Integer>();
	a1.add(10);
	a1.add("ok");
	a1.add(true);
	a1.add('e');
    System.out.println(a1);
    a1.add(2, 7.5);
    System.out.println(a1);
}
}
