package relationship;
import java.util.Scanner; 
public class Executable {
	public static void main(String[] args) {
		Swiggy ref = new Swiggy ("Hotel_Vishava",1457823941);
		Scanner sc =  new Scanner (System.in);
		boolean condition = true;
		while (condition) {		
		System.out.println("WELCOME ON ZOMATO >> Choose What You Want\n1. Select Order\n2. Cancel Order\n3. Display Order Details\n4. Update Order Details\n5. Exit");
		int choose = sc.nextInt();
			switch (choose) {
				case 1 : {
					System.out.println("Enter Customer Name");
					String name = sc.next();
					System.out.println("Enter Contact Number");
					long cno = sc.nextLong();					
					System.out.println("Enter Dilievery Address");
					String address = sc.next();
					System.out.println("Thank you For Your Information :) ");
					System.out.println("You Want Save This Information For Future Orders..?\n1. YES\n2. NO");
					int x = sc.nextInt();
					if (x==1) {
						System.out.println("Your Information Saved Successfully for future Orders....");
					}
					else {
						System.out.println("Thanks For Choosing :) ");
					}				
					
					System.out.println();
					System.out.println("Today's Special Item....select The Option >>>>>\n1. Biryaani\n2. Paav Bhaaji\n3. Ice Cream\n4. Enter Your Choice");
					int option = sc.nextInt();
					if (option == 1 || option ==2 || option == 3) {
						System.out.println("Order Is Confirm");
						ref.selectOrder(new Customer (name,cno,address));
					}
					else if (option == 4) {
						System.out.println("Enter Your Favourite Dish");
						String dish = sc.next();
						System.out.println("your order >>"+dish+"<< is Confirm");
						ref.selectOrder(new Customer (name,cno,address));
					}
					else {
						System.out.println("Something Went Wrong Sir....... Try Again With Valid Input");
					}
				
				}
				break;
				case 2 : ref.cancelOrder();
				break;
				case 3 : ref.displayOrderDetails();
				break;
				case 4 : ref.updateOrderDetails();
				break;
				case 5 : {
					condition = false;
					System.out.println("The Window Is Closed...........Hope You Enjoyed Zomato :) ");
				}
				break;
				default : {
					System.out.println("Something Went Wrong Sir....... Try Again With Valid Input");
				}
			}
		}
	}
}
