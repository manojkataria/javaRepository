package main.java;

public class Person {

	private String name;
	private int age;
	private String invoiceId;
	

	public Person(String name, int age, String invoiceId) {
		super();
		this.name = name;
		this.age = age;
		this.invoiceId = invoiceId;
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
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	
}
