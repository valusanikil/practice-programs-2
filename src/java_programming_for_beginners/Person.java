package java_programming_for_beginners;

public class Person {
	
	private String name;
	private long phone;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return String.format("name-%s ,phone-%d ,email-%s", name,phone,email);
	}
	
}
