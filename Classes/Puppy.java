/*	ACCESSING INSTANCE VARIABLE AND METHODS.
	1. Create an object:
		ObjectReference = new Constructor();

	2. Call a variable:
		ObjectReference.variablename;

	3. Call a class method:
		ObjectReference.MethodName();
*/



public class Puppy  //This is the Puppy class. It has one constructor and two methods.
{

    int puppyAge;

    //Notice how the name for the class and the constructor are the same.
    public Puppy(String name) //This constructor creates a Puppy object. It has one parameter for the name.
    {
        System.out.println("Name chosen is : " + name);
    }

    public void setAge( int age)  //a method
    {
        puppyAge = age;
    }

    public int getAge()
    {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }


// The class also has a main method. It uses the constructor to create an instance of Puppy and invokes the setAge and getAge methods
    public static void main(String []args)
    {
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


