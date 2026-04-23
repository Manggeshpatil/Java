package collectio;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
	student s;
	Scanner sc = new Scanner (System.in);
	ArrayList<student> a = new ArrayList<student>();
	String schoolName = "S. N. R. Highschool";
	
	public void takeAdmission () {
		System.out.println("Enter the id for Admission");
		int id = sc.nextInt();
		System.out.println("Enter Student Name for Admission");
		String sName = sc.next();
		System.out.println("Enter Standard");
		int std = sc.nextInt();
		s=new student(id, sName, std);
		a.add(s);
		System.out.println("Admission Are Done Successfully...");
	}
	
	public void cancelAdmission() {
		System.out.println("Enter the id For Cancel the Admission");
		int id = sc.nextInt();
		for (student m : a) {
			if (id==m.id) {
				System.out.println(a.remove(s));
				System.out.println("Admission Cancelled Successfullyyy...");
				return;
			}			
		}
		System.out.println("its Id Does Not Exist");
	}
	
	public void  displayDetails () {
		System.out.println("Enter the id For Access Details Of Student Admission");
		int id = sc.nextInt();
		for (student m : a) {
			if (id==m.id) {
				System.out.println("School Name :--->>>"+schoolName);
				System.out.println(m);
				return;
			}			
		}
		System.out.println("its Id Does Not Exist");
	}
	
	public void UpdateDetails () {
		System.out.println("Enter Id For Update Details");
		int id = sc.nextInt();
		for (student m : a) {
			if (id==m.id) {
				System.out.println("What you Want To Update..\n1. Id\n2. Name\n3. Std\n4. All");
				int i = sc.nextInt();
				switch (i) {
					case 1 : {
						System.out.println("Enter New Id");
						int newId = sc.nextInt();
						m.id=newId;
						System.out.println("Id succefully updated");
					}
					break;
					case 2 : {
						System.out.println("Enter New Name");
						String newName = sc.next();
						m.sName=newName;
						System.out.println("Name succefully updated");
					}
					break;
					case 3 : {
						System.out.println("Enter New Std");
						int newStd = sc.nextInt();
						m.std=newStd;
						System.out.println("Std succefully updated");
					}
					break;
					case 4 : {
						System.out.println("Enter New Id");
						int newId = sc.nextInt();
						m.id=newId;
						System.out.println("Enter New Name");
						String newName = sc.next();
						m.sName=newName;
						System.out.println("Enter New Std");
						int newStd = sc.nextInt();
						m.std=newStd;
						System.out.println("All Details updated Successfully....");
					}
					default : {
						System.out.println("Enter Valid Choice");
					}
				}
				return;
			}
		}
		System.out.println("its Id Does Not Exist");
	}
}