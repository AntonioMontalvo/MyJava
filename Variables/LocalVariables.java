//A variable is a named storage that our programs can manipulate. Each variable has specific type, which determines the size and layout of the variable's memory.

/*
	Basic form of a variable declaration:

		data type variable [ =value, variable[ =value]...];

	e.g 
	int a, b, c;
	int a =  10
	byte B = 22;
	double pi = 3,1416;
	char a = 'a';	



*/	//LOCAL VARIABLES ARE:
/*
	-Declared in methods, constructors or blocks
	-Are created when the above are called and destroyed when once the method exits.
	-Only visible within the above
	-Implementd at stack level
	-An initial value should be assigned before the first use.
*/  

public class LocalVariables {
	public void myAge(){ //this is a method that declares a variable age and prints a message using that variable
		int age = 45;
		System.out.println("Antonio's age is :" + age);
	}

	public static void main(String args[]){
		LocalVariables personStatement = new LocalVariables();
		personStatement.myAge();
	}
}