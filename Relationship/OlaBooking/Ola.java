package OlaBooking;

import java.util.Scanner;

public class Ola {
	Cab c;
	
	public void bookCab(int choice,String pikup,String destination)
	{
		if (this.c==null)
		{
			if(choice==1)
			{
				c=new Prime(pikup,destination);
				System.out.println("prime cab booked successfully");
				System.out.println("-----------------------------------------------------------");
			}
			else if(choice==2)
			{
				c=new Xuv(pikup,destination);
				System.out.println("Xuv cab booked succeessfully");
				System.out.println("--------------------------------------------------------------");
			}
			else if(choice==3)
			{
				c=new Mini(pikup,destination);
				System.out.println("Mini cab booked successfully");
				System.out.println("-----------------------------------------------------------");
			}
			else
			{
				System.out.println("Invalid cab");
				System.out.println("------------");
			}
		}
		else
		{
			System.out.println("Cab is already booked");
			System.out.println("-----------------------");
		}
	}
	public void cancleCab() {
		if (this.c==null) {
			
			System.out.println("first cab book");
			System.out.println("------------------");
		}
		else
		{
			this.c=null;
			System.out.println("Cab cancled successfully");
			System.out.println("-------------------------");
		}
	}
	public void checkCab() {
        if (this.c==null) {
			
			System.out.println("No any booking here");
			System.out.println("------------------");
		}
		else
		{
			System.out.println("One Cab booked is here");
			System.out.println("-------------------------");
		}
	}
	public void showCab()
	{
		if (this.c==null) 
		{
			System.out.println("No cab booking is here");
			System.out.println("-------------------------");
		}
		else
		{
			if (this.c instanceof Prime)
			{
				Prime p1=(Prime)c;
				System.out.println("Your Booking.........");
				System.out.println("Cab Type : Prime Cab");
				System.out.println("Cab Driver : "+p1.getDname());
				System.out.println("Cab NO : "+p1.getCno());
				System.out.println("Cab Name : "+p1.getName());
				System.out.println("Cab Color : "+p1.getColor());
				System.out.println("Cab Pikup : "+p1.getPikup());
				System.out.println("Your Destination : "+p1.getDestination());
				System.out.println("------------------------------------------");
			}
			else if (this.c instanceof Xuv)
			{
				Xuv x1=(Xuv)c;
				System.out.println("Your Booking.........");
				System.out.println("Cab Type : Xuv Cab");
				System.out.println("Cab Driver : "+x1.getDname());
				System.out.println("Cab NO : "+x1.getCno());
				System.out.println("Cab Name : "+x1.getName());
				System.out.println("Cab Color : "+x1.getColor());
				System.out.println("Cab Pikup : "+x1.getPikup());
				System.out.println("Your Destination : "+x1.getDestination());
				System.out.println("------------------------------------------");
			}
			else 
			{ 
			    Mini m1=(Mini)c;
				System.out.println("Your Booking.........");
				System.out.println("Cab Type : Mini Cab");
				System.out.println("Cab Driver : "+m1.getDname());
				System.out.println("Cab NO : "+m1.getCno());
				System.out.println("Cab Name : "+m1.getName());
				System.out.println("Cab Color : "+m1.getColor());
				System.out.println("Cab Pikup : "+m1.getPikup());
				System.out.println("Your Destination : "+m1.getDestination());
				System.out.println("------------------------------------------");
			
		    }
		}
	}
	public void UpdatePikup()
	{
		Scanner sc=new Scanner(System.in);
		if (this.c==null)
		{
		System.out.println("First book cab then update cab pikup");	
		System.out.println("-------------------------------");
		}
		else
		{
			System.out.println("Update to cab pikup");
			 String pikup=sc.next();
			 c.setPikup(pikup);
			 System.out.println("Pikup update successfully");
			 System.out.println("--------------------------------");
		}
	}
	public void updateDestination()
	{
		Scanner sc=new Scanner(System.in);
		if (this.c==null)
		{
		System.out.println("First book cab then update your destination");	
		System.out.println("-------------------------------");
		}
		else
		{
			System.out.println("Update your new destination");
			 String destination=sc.next();
			 c.setDestination(destination);
			 System.out.println("Destination  update successfully");
			 System.out.println("--------------------------------");
		}
		
	}

}


	
	

