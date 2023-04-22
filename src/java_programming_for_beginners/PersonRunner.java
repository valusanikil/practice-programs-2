package java_programming_for_beginners;

public class PersonRunner {
	public static void main(String[] args) {
		
		Person person=new Person();
		Studentt studentt=new Studentt();
		Employee employee=new Employee();
		
		employee.setName("Nikil");
		employee.setEmail("Valusa.nikhil13@gmail.com");
		employee.setPhone(9676910154L);
		employee.setTitle("Software Enginner");
		employee.setEmployer("IT");
		employee.setEmployeeGrade("A Garde");
		employee.setSalary(28000.00);
	
		System.out.println(employee);
	}
		
}
