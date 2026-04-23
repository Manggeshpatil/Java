import java.util.Scanner;
class MobileDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Mobile m1 = new Mobile();
		System.out.println(m1.getcompany());
		System.out.println(m1.getprice());
		System.out.println(m1.getcolor());
		System.out.println("---------------------------");
		System.out.println("Enter the mobile company");
		String comp = sc.next();
		m1.setcompany(comp);
		System.out.println("mobile company updated successfully-----");
		System.out.println("---------------------------");
		System.out.println("Enter the mobile price");
		double price = sc.nextDouble();
		m1.setprice(price);
		System.out.println("mobile price updated successfully-----");
		System.out.println("---------------------------");
		System.out.println("Enter the mobile color");
		String color = sc.next();
		m1.setcolor(color);
		System.out.println("mobile color updated successfully-----");
		System.out.println("--------------------------");
		System.out.println(m1.getcompany());
		System.out.println(m1.getprice());
		System.out.println(m1.getcolor());
	}
}
