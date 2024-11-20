package pojo;

public class Student {
	private String name;
	private int age;
	private double[] grades;

	public Student() {
		super();
	}

	public Student(String name, int age, double[] grades) {
		super();
		this.name = name;
		this.age = age;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public double calculateAverage() {
		double sum = 0;
		if (this.grades.length == 0) {
			this.error();
			return 0;
		}
		for (double i : this.grades) {
			if (i >= 0 && i <= 10) {
				sum += i;
			} else {
				this.error();
				return 0;
			}
		}
		return sum / this.grades.length;
	}

	public void getInfo() {
		System.out.println(
				"Ten sinh vien: " + this.name + " tuoi: " + this.age + " diem trung binh: " + this.calculateAverage());
	}

	public void error() {
		System.out.println("Error r!");

	}
}
