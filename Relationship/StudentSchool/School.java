package StudentSchool;

import java.util.Scanner;

public class School {
  String name;
  Student s;
public School(String name) {
	this.name = name;
}
public void addstudent() {
	if (this.s == null)
	{
		this.s = s;
		System.out.println("admision successfully");
		System.out.println("----------------------------------------");
	}
	else 
	{
		System.out.println("admision is already taken yet");
		System.out.println("-----------------------------------------");
	}
}
public void canceleadmision() {
	if (this.s == null)
	{
		
		System.out.println("admision is not taken yet");
		System.out.println("-----------------------------------------");
	}
	else 
	{
		this.s = null;
		System.out.println("admision cancele successfully");
		System.out.println("-----------------------------------------");
	}
}
public void updatestd() {
	if (this.s == null)
	{
		System.out.println("admision is not taken yet ");
		System.out.println("-----------------------------------------");
	}
	else 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the new std to update");
		int std = sc.nextInt();
		s.setStd(std);
		System.out.println("std updated successfully-----");
		System.out.println("-----------------------------------------");
	}
}
public void displaydetails() {
	if (this.s == null)
	{
		System.out.println("admision is not taken yet----");
		System.out.println("------------------------------------------");
	}
	else
	{
		System.out.println("=========="+name+"===========");
		System.out.println("student name:"+ s.getSname());
		System.out.println("student id :"+ s.getId());
		System.out.println("student std:"+ s.getStd());
		System.out.println("------------------------------------------");
	}
 }
}
