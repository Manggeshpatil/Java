package ParentChild;

public class Child extends Parent {
	public static void m1()
	{
		System.out.println("Hello Frome Child m1()");
	}
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.m1();
		Child c1 = new Child();
		c1.m1();
		Parent p2 = new Child();
		p2.m1();
	}
}
