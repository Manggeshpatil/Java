package StarPattern;

import java.util.Scanner;

public class StarPattern6 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: "); //takes input from user

        int rows = sc.nextInt();

        for (int i= rows; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                if( j<1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Enter the number of rows:
//    3
//    ****
//    * *
//    **
//    *
}
