import java.io.*;
public class InstanceVariable{
	public String name;// this instance is visible for every child

	private double salary; // salary is visible in Employee class only.

	public InstanceVariable (String empName){ //name is assigned in the constructor
		name = empName;
	}

	public void setSalary( double empSal){ //salary is assigned a value
		salary = empSal;
	}

	public void printEmp(){ //this method prints the Employee salary
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}

	public static void main (String args[]){ //the main method
		Employee empOne = new Employee("Antonio");
		empOne.setSalary(1000);
		empOne.printEmp();
	}

}