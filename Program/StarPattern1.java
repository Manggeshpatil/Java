package StarPattern;

import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please provide number of rows to print... ");
	int rows = sc.nextInt();
	for (int i = 1; i <= rows; i++)
	{
	for (int j=1; j<=i; j++)
	{
	if( j == 1 || j == i || i == rows)
	System.out.print("*");
	else
	System.out.print(" ");
	}
	System.out.println();
	}
	}
	}
//ONE TYPE OF PATTERN PROGRAM OUTPUT
//*
//**
//* *
//****


