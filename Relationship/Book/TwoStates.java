package Book;

public class TwoStates extends Book {
	private String bname ="2 States ";
	private String author ="Chetan Bhagat";
	
	TwoStates (int quantity ) {
		super (quantity);
	}

	public String getBname() {
		return bname;
	}

	public String getAuthor() {
		return author;
	}

}
