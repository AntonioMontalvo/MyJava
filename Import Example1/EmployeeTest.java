import java.io.*; //load all classes available in this directory.
public  class EmployeeTest {

	public static void main(String[] args) {//this is the constructor for the class EmployeeTest 
		Employee empOne = new Employee("Antonio Montalvo");
		Employee empTwo = new Employee("Jake H. Lee");	
	

	//INVOKE ALL METHODS FOR EACH OBJECT CREATED.
	empOne.empAge(45);
	empOne.empDesignation("Junior Software Developer");
	empOne.empSalary(1000);
	empOne.printEmployee();

	empTwo.empAge(28);
	empTwo.empDesignation("Junior Software Developer");
	empTwo.empSalary(1000);
	empTwo.printEmployee();
	}
}

//compile Employee.java and EmployeeTest.java
// javac Employee.java 
// javac EmployeeTest.java 
//run java EmployeeTest