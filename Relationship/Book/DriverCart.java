package Book;

import java.util.Scanner;

public class DriverCart {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Cart ref = new Cart();
		boolean exit = true;
		while (exit) {
			System.out.println("Enter The Choice\n1. Add Book\n2. Remove Book\n3. Check Cart\n4. Show Book\n5. Exit");
			int choice =  sc.nextInt();
			switch (choice) {
				case 1 : {
					System.out.println("Enter Book (What You Want to Add)\n1. Romeo Juliet\n2. 2 States\n3. Harry Potter");
					int a = sc.nextInt();
					System.out.println("Enter The Quantity For Selected Book");
					int quantity = sc.nextInt();
					ref.addBook(a,quantity);
				}
				break;
				case 2 : ref.removeBook();
				break;
				case 3 : ref.checkCart();
				break;
				case 4 : ref.showBook();
				break;
				case 5 : {
					exit = false;
					System.out.println("Application Closed......");
				}
				break;
				default : System.out.println("Something Went Wrong...");
			}
		}
	}

}
