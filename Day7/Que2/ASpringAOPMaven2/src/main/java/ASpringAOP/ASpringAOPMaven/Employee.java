package ASpringAOP.ASpringAOPMaven;

public class Employee {
	private int id;
	private String name;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		System.out.println("innnnnnnnnnnnn getId()");
		
		return id;
	}
	public void setId(int id) {
		System.out.println("in setId()");

		this.id = id;
	}
	public String getName() {
		System.out.println("innnnnnnnnnnn getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println("in setName()");

		this.name = name;
	}
	
}
