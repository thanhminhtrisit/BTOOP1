package pojo;

public class Manager extends Employee {
	private String department;

	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, String department) {
		// TODO Auto-generated constructor stub
		super(name, age, salary);
		this.department = department;
	}

	@Override
	public void displayInfo() {
		super.displayInfo(); 
		System.out.println("Department: " + department);
	}
}
