public class ForLoop {

	public static void main(String args[]){

		for (int x = 0; x <= 20; x++){
			System.out.print("The value of x: " + x );
			System.out.print("\n");
		}
	}
}

// A for loop is a repetion control structure that allows you to write a loop that need to be executed a specific number of times. So is useful when you know the number times you want your task to be repeated.

// The flow of control in a for loop goes as follows:
	// 1. Initialization is executed first an only once. 
	// 2. The boolean expression is evaluated. If it is true, then the body of the loop is executed and control jumps to the next statement to be looped.
	// 3. Once the body of the llop gets executed, the update statement is next in the control.
	// 4. The boolean expression is now evaluated again, etc...
