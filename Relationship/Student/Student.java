package Student;

public class Student {
		String sname;
		int id;
		public Student (String sname , int id) {
		this.sname = sname;
		this.id = id;
		}
		public String tostring() {
		return sname;
		}
		public int hashCode()
		{
			return objects hash(sname,id);
		}
	public boolean equals (object o) {
	
	Student s1 = (Student)o;
	return this sname.equals (s1.sname ) && this.id ==s1.id;
	
}
}
