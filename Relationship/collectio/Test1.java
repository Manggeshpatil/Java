package collectio;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList <>();
	a1.add(10);
	a1.add("ok");
	a1.add(true);
	a1.add('e');
	System.out.println(a1);
	Iterator i = a1.iterator();
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
}
}
