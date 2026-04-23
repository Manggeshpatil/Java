package Exception;

import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	System.out.println("Main String");
	Scanner sc  = new Scanner (System.in); 
	int a = sc.nextInt();
	System.out.println(a);//NullPointerException
	System.out.println("Main end");
}
}
