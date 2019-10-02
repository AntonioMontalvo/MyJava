//Implementing a simple class from Java for everyone

public class SimpleCounter
{
	private int counter; //this is our instance variable

	//Remember every class needs a main method.
	public static void main(String[] args)
	{
		//let's create a couple of instances
		SimpleCounter attendeesNum = new SimpleCounter();

		SimpleCounter booksSold = new SimpleCounter();

		//now lets invoke the count method for attendeesNum and booksSold
		attendeesNum.count();
		attendeesNum.count();
		attendeesNum.count();
		//it should be 3 attendees
		booksSold.count();
		//we sold 1 book

		//Now lets invoke the getCount method
		System.out.println(attendeesNum.getCount() + " people at the gig.");
		System.out.println("We sold " + booksSold.getCount() + " book in total.");

	}

	public void count()//this method ads one to the counter
	{
		counter = counter + 1;
	}

	public int getCount()
	{
		return counter;
	}

} 

//Look at MarketRegister.java for an expanded example and more in-depth classes and objects information.