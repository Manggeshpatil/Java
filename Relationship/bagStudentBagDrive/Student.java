package bagStudentBagDrive;

public class Student {
	String name;
	int RollNo;
	Bag b;
		public Student(String name, int RollNo) {
			this.name = name;
			this.RollNo = RollNo;		
	}
	public void tocarry(Bag b) {
		this.b = b;
		System.out.println("Student name :"+ name );
		System.out.println("Student RollNo :"+ RollNo );
		System.out.println("Bag Company :"+ b.Company);
		System.out.println("Bag Price :"+ b.Price);
		System.out.println("Bag Color :"+ b.Color);
	}
}