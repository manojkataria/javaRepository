package designpattern.creational;

public class Employee implements Cloneable {
	private String name;
	private Integer age;
	private EmployeeAddress empAddress;

	// Employee constructor
	public Employee(String name, Integer age, EmployeeAddress empAddress) {
		this.name = name;
		this.age = age;
		this.empAddress = empAddress;
	}

	// setters and getters for name, age and empAddress go here

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}

	public String toString() {
		return "Employee Name:" + this.name + "  Age:" + this.age + " Address:" + empAddress;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Shallow copy
		
		
		//Deep copy of the reference object like address...
		/*Employee empClone = (Employee) super.clone();
		EmployeeAddress empAddressClone = new EmployeeAddress(this.empAddress.getHouseNo(),
		                                      this.empAddress.getStreet(),
		                                      this.empAddress.getCity());
		empClone.setEmpAddress(empAddressClone);
		
		return empClone;*/
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee empObj = (Employee) obj;
		return this.age == empObj.age && this.name.equalsIgnoreCase(empObj.name);
	}

}