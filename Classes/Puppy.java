/*	ACCESSING INTANCE VARIABLE AND METHODS.
	1. Create an object:
		ObjectReference = new Constructor();

	2. Call a variable:
		ObjectReference.variablename;

	3. Call a class method:
		ObjectReference.MethodName();	
*/

public class Puppy {
	int puppyAge;

	public Puppy(String name){
		//This constructor has one parameter, name.
		System.out.println("Name chosen is : " + name);
	}

	public void setAge( int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String []args){
		// Object Creation
		Puppy myPuppy = new Puppy("Sasha");

		//Call class method to set puppy's age
		myPuppy.setAge(1);

		//method to get puppy's age
		myPuppy.getAge( );

		//Access instance variable
		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}