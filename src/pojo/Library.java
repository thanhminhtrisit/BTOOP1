package pojo;

import java.util.List;

public class Library {
	private List<Book> books;

	public Library() {
		super();
	}

	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void display() {
		for(Book b : this.books) {
			System.out.println(b);
		}
	}
	
	public void borrow(Book book) {
		for (Book b : this.books) {
			if (book.equals(b) && b.isStatus()==true) {
				b.borrow();
				break;
			}else {
				System.out.println("The book has been borrowed");
				break;
			}
		}
	}
	
	public void returnBook(Book book) {
		for (Book b : this.books) {
			if (book.equals(b) && b.isStatus()==false) {
				b.returnBook();;
				break;
			}
		}
	}
	
	public void borrowWithAuthor(String author) {
		for (Book b : this.books) {
			if (b.getAuthor().equalsIgnoreCase(author) && b.isStatus() == true) {
				b.borrow();
				break;
			}else {
				System.out.println("The book has been borrowed");
				break;
			}
		}
	}
	
	public void returnBookWithAuthor(String author) {
		for (Book b : this.books) {
			if (b.getAuthor().equalsIgnoreCase(author) && b.isStatus()==false) {
				b.returnBook();;
				break;
			}
		}
	}
	
	public void borrowWithTitle(String title) {
		for (Book b : this.books) {
			if (title.toLowerCase().equals(b.getTitle().toLowerCase()) && b.isStatus()==true) {
				b.borrow();
				break;
			}else {
				System.out.println("The book has been borrowed");
				break;
			}
		}
	}
	
	public void returnBookWithTitle(String title) {
		for (Book b : this.books) {
			if (b.getTitle().equals(title) && b.isStatus()==false) {
				b.returnBook();;
				break;
			}
		}
	}
}
