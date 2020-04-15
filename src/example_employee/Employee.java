package example_employee;

public class Employee {
	int id;
	String name;
	int age;
	long contact;
	

	public Employee() {

	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Employee(int id, String name, int age, long contact) {
		
		this(id,name); // chaining of the constructor should be done in first only
		this.age = age;
		this.contact = contact;
	}

	public void printEmployee() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Contact = " + contact);
	}

}
