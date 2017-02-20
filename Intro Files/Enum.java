//Here is an example of what an Enum
class FreshJuice{//create a class
	enum FreshJuiceSizes {Small,Medium,Large} // define the enum and it's values.
	FreshJuiceSizes size;
}

public class Enum { //
	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice(); //Instance of the class
		juice.size = FreshJuice.FreshJuiceSizes.Large; //grab the value
		System.out.println("Size: " + juice.size); //print it
	}
}