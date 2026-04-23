package relationship;
import java.util.Scanner;
public class Swiggy {
	Customer c;
	String hotel;
	long orderId;
		
	public Swiggy(String hotel, long orderId) {
		this.hotel = hotel;
		this.orderId = orderId;
	}
	public void selectOrder(Customer c) {
		if (this.c==null) {
			this.c=c;
			System.out.println("Your Order Placed Successfully.....\nNote : (Our dilivery Partner Will Contact you soon...For Diliver The Order...)\nThanks For Using Zomato :)  ");
			System.out.println("------------------------------");
		}
		else {
			System.out.println("Order Placed Already");
			System.out.println("------------------------------");
		}
		
	}
	public void cancelOrder() {
		if (this.c==null) {
			System.out.println("Placed The Order First");
			System.out.println("------------------------------");
		}
		else {
			this.c=null;
			System.out.println("Order Cancelled Successfully....");
			System.out.println("------------------------------");
		}
	}
	public void displayOrderDetails () {
		if (this.c==null) {
			System.out.println("Placed The Order First");
			System.out.println("------------------------------");
		}
		else {
			System.out.println("Order Id : " + orderId);
			System.out.println("Hotel Name : " + hotel);
			System.out.println("Customer Name : " + c.getName());
			System.out.println("Customer Contact Number : " + c.getCno());
			System.out.println("Customer Address : " + c.getAddress());
			System.out.println("---------------------------------");
		}
		}
		public void updateOrderDetails() {
			if (this.c==null) {
				System.out.println("Placed The Order First");
				System.out.println("------------------------------");			
			}
			else {
				Scanner sc =  new Scanner (System.in);
				System.out.println("Choose What you want to update\n1. Hotel Name\n2. Contact Number\n3. Name\n4. Address\n5. I Want update All Details\n6. For Now I Want Exit");
				int choose = sc.nextInt();
				switch (choose) {	
				case 1 : {
					System.out.println("Enter Hotel name for Update");
					hotel = sc.next();
					System.out.println("Hotel Name Updated Successully.....");
					System.out.println("------------------------------");
				}
				break;
				case 2 : {
					System.out.println("Enter Contact Number for update");
					long cno = sc.nextLong();
					c.setCno(cno);
					System.out.println("Contact Number Updated Successully.....");
					System.out.println("------------------------------");
				}
				break;
				case 3 : {
					System.out.println("Enter Name for update");
					String name =  sc.next();
					c.setName(name);
					System.out.println("Name Updated Successully.....");
					System.out.println("------------------------------");
				}
				break;
				case 4 : {
					System.out.println("Enter New Address for update");
					String address = sc.next();
					c.setAddress(address);
					System.out.println("Address Updated Successully.....");
					System.out.println("------------------------------");
				}
				break;
				case 5 : {
					System.out.println("Enter Hotel name for Update");
					hotel = sc.next();
					System.out.println("Enter Contact Number for update");
					long cno = sc.nextLong();
					c.setCno(cno);
					System.out.println("Enter Name for update");
					String name =  sc.next();
					c.setName(name);
					System.out.println("Enter New Address for update");
					String address = sc.next();
					c.setAddress(address);
					System.out.println("All Details Updated Successfully......");
					System.out.println("------------------------------");
				}
				break;
				case 6 : {
					System.out.println("Thanks For Choosing Updation..........Your Always Welcome Here For Future Updation :) ");
					System.out.println("------------------------------");
				}
				break;
				default : {
					System.out.println("Something Went Wrong Sir....... Try Again With Valid Input");
					System.out.println("------------------------------");
				}								
			}			
		}
	}	
}
			
		
