public class EnhancedForLoop {

	public static void main(String args[]){
		int [] numbers = {10, 20, 30, 40, 50};

		String [] names = {"James", "John"};

		Boolean [] politicians = {false, false, false};

		for (int x : numbers){
			System.out.print(x);
			System.out.print("\n");
		}

		for (String name : names){
			System.out.print(name);
			System.out.print(",");
			System.out.print("\n");
		}

		for (Boolean politician: politicians){
			System.out.print(" As a politician I'm truly " +  politician);
			System.out.print(",");
			System.out.print("\n");
		}
	}
}

// This Java Enhanced for loop looks a lot like a for in loop in JavaScript.

// It is mainly used to traverse collection elements including arrays.

// The syntax is:
//	for (declaration: expression){
//		Statements	
//}

// Inside the for loop, the declaration must be of the same type of the elements you are accessing. The expression evaluates to the array you need to loop through. This can be an array or method call that returns an array. 