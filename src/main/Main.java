package main;

import java.util.ArrayList;
import java.util.List;

import pojo.BankAccount;
import pojo.Book;
import pojo.Employee;
import pojo.Laptop;
import pojo.Library;
import pojo.Manager;
import pojo.Product;
import pojo.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		double[] m = { 8, 8, 9, 10};
		student.setName("Thanh");
		student.setAge(18);
		student.setGrades(m);
		student.getInfo();

		System.out.println();
		BankAccount account = new BankAccount();
		account.setAccountNumber("8888");
		account.setBalance(10000);
		account.deposit(200);
		account.displayBalance();
		account.deposit(-1);
		account.withDraw(1200);
		account.displayBalance();
		account.withDraw(12000);

		System.out.println();
		Book b1 = new Book("Java", "A", true);
		Book b2 = new Book("C", "B", false);
		Book b3 = new Book("Python", "C", true);
		Book b4 = new Book("Spring", "D", true);
		List<Book> books = new ArrayList<Book>();
		books.add(b4);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Library library = new Library();
		library.setBooks(books);
		library.display();
		library.borrow(b4);
		library.display();
		System.out.println();
		library.borrow(b2);
		library.borrowWithAuthor("a");
		library.display();
		library.borrowWithTitle("Java");
		library.display();
		library.borrowWithTitle("Java");

		System.out.println();
		Employee employee = new Employee("Alice", 30, 5000);
		System.out.println("Employee Info:");
		employee.displayInfo();
		Manager manager = new Manager("Bob", 45, 8000, "IT");
		System.out.println("Manager Info:");
		manager.displayInfo();

	}
}
