package ParentChild;

public class ChildP extends ParentC {

		String s1 = "ParentC";
	
	public static void main(String[] args) {
		ParentC p1 = new ParentC();
		System.out.println(p1.s1);
		
		ChildP c1 = new ChildP();
		System.out.println(c1.s1);
		
		ParentC p2 = new ChildP();
		System.out.println(p1.s1);
	}
}
