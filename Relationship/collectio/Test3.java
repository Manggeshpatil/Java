package collectio;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList <>();
		a1.add(10);
		a1.add("ok");
		a1.add(true);
		a1.add('e');
		System.out.println(a1);//[10, ok, true, e]
		System.out.println(a1.get(2));//true
System.out.println(a1.equals(a1));
	}
}
