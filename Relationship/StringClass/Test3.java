package StringClass;

public class Test3 {
public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = "hello";
	String s3 = new String ("Hello");
	String s4 ="hello";
	String s5 = new String ("Hello World");
	System.out.println(s1=s3);//Hello
	System.out.println(s2.equals(s3));//false
	System.out.println(s2.equals(s4));//true
	System.out.println(s3.equals(s5));//false
}
}
