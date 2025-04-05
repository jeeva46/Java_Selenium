package Week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		String book = library.addBook("Python");
		library.issueBook();
		System.out.println("Book title is " + book);
	}

}
