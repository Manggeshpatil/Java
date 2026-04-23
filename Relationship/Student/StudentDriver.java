package Student;

public class StudentDriver {

public static void main(String[] args) {
	Student s1 = new Student (Ram,12);
	Student s2 = new Student (Ram,12);
	Student s3 = new Student (Ram,12);
	System.out.println(s1.equal(s3));
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
}
}
