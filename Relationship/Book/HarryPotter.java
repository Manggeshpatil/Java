package Book;

public class HarryPotter extends Book {
	private String bname = "Harry Potter";
	private String author = "J. K. Rawling";
	
	HarryPotter (int quantity ) {
		super (quantity);
	}

	public String getBname() {
		return bname;
	}

	public String getAuthor() {
		return author;
	}
}
