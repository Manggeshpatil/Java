package Book;

public class RomeoJuliet extends Book {
	private String bname = "Romeo Juliet";
	private String author = "William Shakespear";
	
	RomeoJuliet (int quantity ) {
		super (quantity);
	}

	public String getBname() {
		return bname;
	}

	public String getAuthor() {
		return author;
	}

}
