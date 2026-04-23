package bagStudentBagDrive;

import java.util.Scanner;

public class BagDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter Student RollNo");
		int RollNo = sc.nextInt();
		Student s1 = new Student (name, RollNo);
		System.out.println("Enter Bag Company");
		String Company = sc.next();
		System.out.println("Enter Bag Price");
		double Price = sc.nextDouble();
		System.out.println("Enter bag color");
		String Color = sc.next();
		s1.tocarry(new Bag(Company,Price,Color));
	}
}
