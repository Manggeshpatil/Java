package Interface;

import java.lang.reflect.Array;

public class BookDriver {

	public static void main(String[] args) {
		
		Book b1 [] = new Book [4];
		b1[0] = new Book ("java",13);
		b1[1] = new Book ("c",11);
		b1[2] = new Book ("SQL",14);
		b1[3] = new Book ("Python",12);
		
		for (int i=0; i<b1.length; i++) {
			System.out.println(b1[i]);
		}
			System.out.println("-------------------------------------");
			
			Array.sort(b1);
			for(int i=0;i<b1.length;i++) {
				System.out.println(b1[i]);
		}
 	}
	
}
