package java_programming_for_beginners;

public class Employee extends Person{
	
	private String title;
	private String employer;
	private String employeeGrade;
	private double salary;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("name-%s ,phone-%d ,email-%s, title-%s, employer-%s, employeeGrade-%s, salary-%f",
				super.getName(),super.getPhone(),super.getEmail(),title,employer,employeeGrade,salary);
	}
	
}
