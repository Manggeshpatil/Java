package StringBuffer;

public class Test14 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		s1.setCharAt(2, 'W');
		System.out.println(s1);//HeWlo
	}
}
