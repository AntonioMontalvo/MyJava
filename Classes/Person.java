/* CLASSES IN JAVA
A class is a blueprint from which individual objects are created.

A class can contain:
-Local variables: if defined inside methods, constructors or blocks. Declared and initialized  within the method. Destroyed after the method is complete.

-Instance variables: if within a class but outside a method. Initialized when the class is instantiated. Accessible from inside any method, constructor or block of that particular class.

-Class variables: declared within a class outside of methods, with the static keyword.

*/

// public class Dog {
// 	String breed;
// 	String color;

// 	void barking(){//->THIS ARE METHODS

// 	}
// 	void hungry(){

// 	}
// }


/*	CONSTRUCTORS
	Every class has a contructor. Even if we don't write it the compiler will create one by default for the class.
	Constructors will be invoked every time an object is created. They should have the same name as the class. A class can have more than one constructor.
*/

//////////////////////////////
////  CREATING AN OBJECT  ////
//////////////////////////////

/*
	An object is created from a class. Three steps when creating an object:
		1. Declaration: A variable with name and type is declared.
		2. Instantiation: Using the keyword 'new' we create a new object.
		3. Inititialization: with a call to the constructor we initialize the new object.
*/
public class Person
{
    public Person (String name) //this is the constructor. Notice it has the same name as the class.
    {
        //name is a parameter in the constructor.
        System.out.println("Person's name is :" + name);
    }
    public static void main (String []args)
    {
        //Now we create an object
        Person myFriend = new Person("Johnny");
    }
}



