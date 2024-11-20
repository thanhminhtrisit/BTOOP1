package pojo;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount() {
		super();
	}

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Successfully adding " + amount + " the balance now is: " + this.balance);
		} else {
			System.out.println("The amount is not suiable");
		}
	}

	public void withDraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Your balance is not enough to draw!");
		} else {
			this.balance -= amount;
			System.out.println("You have success drawed: " + amount + " now your balance is: " + this.balance);
		}
	}

	public void displayBalance() {
		System.out.println("Your balance is: " + this.balance);
	}
}
