package collectio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Test2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList <>();
		a1.add(10);
		a1.add("ok");
		a1.add(true);
		a1.add('e');
		System.out.println(a1);//[10, ok, true, e]
		ListIterator l1 = a1.listIterator();
		System.out.println(l1.hasNext());//true
		System.out.println(l1.next());//10
		System.out.println(l1.hasNext());//true
		System.out.println(l1.next());//ok
		System.out.println(l1.hasPrevious());//true
		System.out.println(l1.previous());//ok
		System.out.println(l1.hasPrevious());//true
		System.out.println(l1.previous());//10
		System.out.println(l1.hasPrevious());//false
		System.out.println(l1.previous());//NoSuchElementException
	}
}
