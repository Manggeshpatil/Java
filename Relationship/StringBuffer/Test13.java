package StringBuffer;

public class Test13 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1.capacity());//21
		s1.trimToSize();
		System.out.println(s1.capacity());//5
	}
}
