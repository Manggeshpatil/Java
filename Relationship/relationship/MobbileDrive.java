package relationship;

public class MobbileDrive {
	public static void main(String[] args) {
		Mobbile m1 = new Mobbile ("Samsung",25000, new Battery(12344,"ABC"));
		System.out.println("Mobile Company"+ m1.Company);
		System.out.println("Mobbile Price"+m1.Price);
		System.out.println("Battery Company :"+ m1.b.Company);
		
	}

}
