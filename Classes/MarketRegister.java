//when we desing a class, we have to consider the needs of the programmers who use the class.You need to come up with instance variables and to provide with methods that the users will call.

//lets create a class for the register
public class MarketRegister
{
	//for the instance variables we can use a small recurring pattern'
	// a counter to keep track how often certain events occur in the life of the object.
	private int itemCounter;
	//an instance variable for the total.
	private double total;

	//instance methods for the class. The methods will 'normally' affect the instance variables. 
	public double addItem(double itemValue)
	{
		itemCounter ++;
		total = total + itemValue; 
		return total;
	}
	//Some methods collect values, strings or other objects.
	public int getCount()
	{
		System.out.println("You have " + itemCounter + " items in your basket.");
		return itemCounter;
	}
	//Some methods collect values, strings or other objects.
	public double getTotal()
	{
		System.out.println("The total amount is: " + total);
		return total;
	}
	//Some clear or reset values.
	public void reset()
	{
		itemCounter = 0;
		total = 0;
	}

//we also need a main method. Remember every class needs a main method.
	public static void main(String[] args) {
		//OBJECTS REFERENCES
		//In Java we create objects by storing the memory location of an object in a variable. In this case register1 refers to the MarketRegister constructor created with the 'new' operator. So the new operator returns a reference object.
		MarketRegister register1 = new MarketRegister();

		//More than one references  can be stored of the same object.
		MarketRegister register2 = new MarketRegister();


		register1.addItem(3.19);
		register1.addItem(4.99);
		register1.getTotal();
		register1.getCount();	

		register2.addItem(2243.99);
		register2.getCount();
		register2.getTotal();

		//The Null reference means that the object refers to NO object at all. The value has not been set.

		MarketRegister register3 = null;

		
	}

	

}