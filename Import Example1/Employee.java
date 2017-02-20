import java.io.*; //load all classes available in this directory.
public class Employee {

		String name;
		int age;
		String designation;
		double salary;

		public Employee(String name){ //The constructor for the Employee class
			this.name = name;  
		}

		public void empAge(int empAge){// method to assign the age of the Employee to the variable age
			age = empAge;
		}

		public void empDesignation(String empDesig){// method to assign the designation of the Employee to the variable 
			designation = empDesig;
		}

		public void empSalary(double empSalary){// method to assign the Salary of the Employee to the variable salary
			salary = empSalary;
		}

		public void printEmployee(){// method to print the Employye details
			System.out.println("Name :" + name);
			System.out.println("Age :" + age);
			System.out.println("Designation :" + designation);
			System.out.println("Salary :" + salary);
		}
}		