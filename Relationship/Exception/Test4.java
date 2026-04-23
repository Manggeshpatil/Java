package Exception;

import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String s1 = null;
	try {
		System.out.println(s1.length());
	}
	catch(NullPointofException k ) {
		System.out.println("somthing went wrong");
	}
}
}
