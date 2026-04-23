package Interface;

public class Book implements comparable {
	String bname;
	int bid;
	
public Book(String bname, int bid) {
	this.bname = bname;
	this.bid = bid;
}
public String toString() {
	return "Book Name:"+bname;
	
}
public boolean equal(object o) {
	Book b2 = (Book)o;
	return this.bname equal(b2.bname);
}

public int CompareTo(object o) {
	Book b2 = (Book)o;
	return this.bname.CompareTo(b2.bname) 
}
	
}

