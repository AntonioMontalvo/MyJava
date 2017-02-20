public class DoWhile {

	public static void main(String args[]){

		int x = 0;

		do {
			System.out.print("Do x++ while " + x  + " is less than 10");
			x++;
			System.out.print("\n");
		} while ( x < 10 );
	}
}

// Similar to the while loop, except that the do while will run at least one time. 