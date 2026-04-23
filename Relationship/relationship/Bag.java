package relationship;

public class Bag {
	Ball b;
    
    public void addBall (int choice, double radius) {
 	   if (this.b==null) {
 		   if(choice==1) {
 			   b=new TennisBall(radius);
 			   System.out.println("Tennis Ball is successfully addes in Bag");
 			   System.out.println("----------------------------");	   
 		   }
 		   else if (choice==2) {
 			   b=new BasketBall(radius);
 			   System.out.println("Basket Ball is successfully addes in bag");
 		   }
 		   else {
 			   System.out.println("Invalid Choice");
 			   System.out.println("----------------------------");
 		   }
 	   }
 	   else {
 		   if (choice == 1) {
 			   System.out.println("Tennis The Ball is Already Addes");
 			   System.out.println("----------------------------");
 		   }
 		   else if (choice ==2) {
	    		   System.out.println("Basket The Ball is Already Addes");
	    		   System.out.println("----------------------------");
 		   }
 		   else {
 			   System.out.println("Invalid Input");
 			   System.out.println("--------------------------------");
 		   } 		   
 	   }
    }
    public void removeBall() {
 	   if (this.b==null) {
 		   System.out.println("Bag is not added in the Bag");
 		   System.out.println("---------------------------");
 	   }
 	   else {
 		   this.b=null;
 		   System.out.println("Ball is successfully removed");
 		   System.out.println("----------------------------");
 	   }
    }
    public void checkBag() {
 	   if (this.b==null) {
 		   System.out.println("Bag is Empty");
 		   System.out.println("----------------------------");
 	   }
 	   else {
 		   System.out.println("Bag is Not Empty");
 		   System.out.println("----------------------------");
 	   }
    }
    public void showGame() {
 	   if (this.b==null) {
 		   System.out.println("Ball is not added in the Bag");
 		   System.out.println("----------------------------");
 	   }
 	   else {
 		   if (this.b instanceof TennisBall) {
 			   TennisBall t1 = (TennisBall)b;
 			   System.out.println("You can play " + t1.getGname());
 			   System.out.println("----------------------------");
 		   }
 		   else if (this.b instanceof BasketBall)
 		   {
 			   BasketBall b1 = (BasketBall)b;
 			   System.out.println("You can Play "+b1.getGname());
 			   System.out.println("----------------------------");
 		   }
 		   else {
 			   System.out.println("Ball Not Found");
 		   }
 	   }
    }
}

