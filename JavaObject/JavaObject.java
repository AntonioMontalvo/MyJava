public class JavaObject { // This is our console application boiler plate.
 
  public static void main(String[] args) {
    
    System.out.println("I'm creating my own Java curriculum");
		System.out.printf("This is priority number %d  %n", Curriculum.TEXT_GRADE ); // %d is for integers and %n is a separator.
		
		// Here we create a brand new object using our Curriculum class as blueprint. First we declare the type of variable; we use Curriculum. Then we name the variable; here name it progressInJava. Then we use the keyword new to create a new instance of Curriculum. With dot notation we can grab myJavaText from the Curriculum class and use it.
		
		Curriculum progressInJava = new Curriculum("Texto"); // new will create an instance of the Curriculum. When we pass "Texto" as an argument, it will be used taken as a parameter in the constructor Curriculum.. Because we are creating an instance of the Curriculum class, progressInJava  will be initialized with the initial values set by the Curriculum constructor. In this case is for myJavaText to be "Texto" and for gradeNumber to be 0.
		
		System.out.printf("Este es mi libro de %s %n", progressInJava.getmyJavaText()); //%s is for String. No we can grab the values in our leaningStuff instance.
		
		if ( progressInJava.isMaxGrade()) {
			System.out.println("No grade yet");	
		}
		
		System.out.println("My Java grade is coming");
		progressInJava.grade();// Call the method  to set the value of gradeNumber to 1.
		
		if (! progressInJava.isMaxGrade()) { // This method returns true or false after chacking if gradeNumber is equal to 10. If it is it returns true, otherwise it returns false.
			System.out.println("We have a grade");	
		}
		
		while(progressInJava.addToGrade()){
				System.out.println("Good job incrementing your grade");
		}
		if (progressInJava.isMaxGrade()) {
			System.out.println("You've riched your max, Congrats!");
		}
		progressInJava.grade(-1);
		while(progressInJava.addToGrade()){
			System.out.println("We've decremented your grade!");
		}
		progressInJava.grade(-40);
	
}
}
// Because both Curriculum.java and JavaObject.java are in the same folder we can access Curriculum.java