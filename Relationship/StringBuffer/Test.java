package StringBuffer;

public class Test {
public static void main(String[] args) {
	StringBuffer s2 = new StringBuffer("Bye");
	StringBuffer s1 = new StringBuffer("Bye");
	System.out.println(s2);//Bye
	System.out.println(s1);//Bye
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//false
}
}
