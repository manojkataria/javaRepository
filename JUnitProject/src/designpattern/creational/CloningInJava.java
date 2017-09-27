package designpattern.creational;
public class CloningInJava {
  public static void main(String args[]){
    EmployeeAddress empAddress =new EmployeeAddress("22","Avenue Street", "Dallas");
    Employee emp = new Employee("David", 32,empAddress);
    Employee empClone = null;
    try {
      empClone=(Employee) emp.clone();
    }catch(CloneNotSupportedException cnse){
      cnse.printStackTrace();
    }
    if(empClone.getEmpAddress()== emp.getEmpAddress()){
    	 System.out.println("empClone's empAddress reference equals emp's empAddress reference.");
    } else {
    	System.out.println("empClone's empAddress reference NOT equals emp's empAddress reference due Deep copy...");	
    }
    System.out.println("Cloned Employee Object (Shallow copy) :--  \n"+emp);
    System.out.println("Cloned Employee Object (Shallow copy) :--  \n"+empClone);
  }
}