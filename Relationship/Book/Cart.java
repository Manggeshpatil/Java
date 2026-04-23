package Book;

public class Cart {
	Book b;
	 public void addBook (int choice, int quanity) {
		 if (this.b==null) {
			 if (choice== 1) {
				 b=new RomeoJuliet(quanity);
				 System.out.println("The RomeoJuliet Book Add Successfully");
				 System.out.println("-------------------------------------");
			 }
			 else if (choice == 2) {
				 b=new TwoStates(quanity);
				 System.out.println("The 2 States Book Add Successfully");
				 System.out.println("-------------------------------------");
			 }
			 else if (choice == 3) {
				 b=new HarryPotter(quanity);
				 System.out.println("The Harry Potter Book Add Successfully");
				 System.out.println("-------------------------------------");
			 }
			 else {
				 System.out.println("Invalid Choice...");
			 }
			 
		 }
		 else {
			 System.out.println("The Book is Already Added !!");
		 }
	 }
	 
	 public void removeBook () {
		 if (this.b==null) {
			 System.out.println("Book is Not Added Yet..");
			 System.out.println("-------------------------------------");
		 }
		 else {
			 this.b=null;
			 System.out.println("The Book Remove is succesfull....");
			 System.out.println("-------------------------------------");
		 }
	 }
	 public void checkCart () {
		 if (this.b==null) {
			 System.out.println("Cart is Empty");
			 System.out.println("-------------------------------------");
		 }
		 else {
			 System.out.println("Cart is Not Empty");
			 System.out.println("-------------------------------------");			 
		 }
	 }
	 public void showBook () {
		 if (this.b==null) {
			 System.out.println("Add Book first...");
			 System.out.println("-------------------------------------");
		 }
		 else {
			 if (b instanceof RomeoJuliet) {
				 RomeoJuliet r = (RomeoJuliet)b;
				 System.out.println("Book Name : "+r.getBname());
				 System.out.println("Book Author Name : "+r.getAuthor());
				 System.out.println("Book Quantity : "+r.getQuantity());
				 System.out.println("---------------------------------");
			 }
			 else if (b instanceof TwoStates) {
				 TwoStates t = (TwoStates)b;
				 System.out.println("Book Name : "+t.getBname());
				 System.out.println("Book Author Name : "+t.getAuthor());
				 System.out.println("Book Quantity : "+t.getQuantity());
				 System.out.println("---------------------------------");
			 }
			 else {
				 HarryPotter h = (HarryPotter)b;
				 System.out.println("Book Name : "+h.getBname());
				 System.out.println("Book Author Name : "+h.getAuthor());
				 System.out.println("Book Quantity : "+h.getQuantity());
				 System.out.println("---------------------------------");
			 }
		 }
	 }

}
