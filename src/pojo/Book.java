package pojo;

public class Book {
	private String title;
	private String author;
	private boolean status;

	public Book() {
		super();
	}

	public Book(String title, String author, boolean status) {
		super();
		this.title = title;
		this.author = author;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void borrow() {
		this.status = false;
		System.out.println("The book has been borrowed");
	}
	
	public void returnBook() {
		this.status = true;
		System.out.println("The book has been returned");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", status=" + status + "]";
	}
	
}
