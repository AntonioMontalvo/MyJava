//In Java, everything is an Object. Objects have states and behaviors. eg A dog Object has states = color, name, breed, and behaviors = barking, eating , wagging tail.
//A Class is a template/blueprint that describes state and behavior the object of its type supports.
//Methods is behavior. A class can contain many methods. In the methods is where the logic is written, data is manipulated and all actions are executed.
//Each Object has its unique set of instance variable. An object's state is created by the values assigned to these instance variable.

//PRINT HELLO WORLD

public class Basic {
	public static void main(String []args){
		System.out.println("Hello World"); //prints Hello World
		//Some variables
		int flightNum = 379;
		String destination = "San Juan, Puerto Rico";
		String carrier = "American Airlines";
		System.out.println("////////////////");
		System.out.println("Some concatanation to start with");
		System.out.println("Today's flight is " + carrier + " number " + flightNum + " with final destination " + destination );
	}
}

//Notice the name of this public class is Basic, the same as the file.
//YOU WILL NEED TO COMPILE FIRST 	e.g javac basic.java
//THEN RUN THE APPLICATION  		java basic
//In Java the main() method is a mandatory. Java program processing starts here.

/*	
	JAVA IDENTIFIERS
		All java components require names. Names for classes, variables and methos are Identifiers. Identifiers show start with a letter A-Z, a-z or $, or _ .Use no keywords, be case sensitive.
*/

/*	
	JAVA VARIABLES
		Local variables
		Class variables
		Instance Variables
*/

/*
	JAVA ARRAYS
		Arrays are objects that store variables of the same type.
*/

/*
	JAVA ENUMS
		Enums restrict a variable to have one of only a few predefined values.That is the values in the enumerated list of values
*/		

//INHERITANCE. Classes can derived from other classes. This concept allows you to reuse fields and methods of the existing class. The existing class is the superclass and the derived one is the subclass.

//INTERFACES in Java language are defined as a contract between objects on how to comumnicate with each other. An interface defines the methods a subclass should use while the implementation of the methods belongs to the subclass.		


