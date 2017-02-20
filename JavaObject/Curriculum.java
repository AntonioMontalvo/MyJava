class Curriculum {
	
	public final static int TEXT_GRADE = 1; // This is  a constant. With final our variable can only be assigned once. The keyword static allows you to provide a variable or method directly from your class. We use the final keyword to specify that we only want the variable to be assigned only once.
	
	final private	String myJavaText; // A String variable declaration. The modifier private blocks any other part of our code to modify this class. We use the final keyword to specify that we only want the variable to be assigned only once. That means values cannot be assigned to myJavaText.
	
	private int gradeNumber; // An int variable declaration.
	
	public Curriculum(String myJavaText){// This is the constructor. Notice it uses the same name as the class. Its a method but it doesn't return anything. Typically, you will use a constructor to give initial values to the instance variables defined by the class, or to perform any other starup procedures required to create a fully formed object. This constructor requires a String to be passed. Here we initialize the myJavaText and gradeNumber variables.
		
			this.myJavaText = myJavaText; // this.myJavaText refers to this instance. 
			gradeNumber = 0;
	}
	
	public void grade() { // method that makes gradeNumber equal to our constant TEXT_GRADE. So when you call this method, the value of gradeNumber will be 1.
		grade(TEXT_GRADE);	
	}
	
	public void grade(int evaluationNum){ //thanks to Java strict typing, two methods can have the same name as long as their parameters are different. Overloading methods is how Java provides default values to methods. It calls the other method with the deafult values.
		int newGradeNumber = gradeNumber + evaluationNum;
		if (newGradeNumber < 0){ //here we are throwing an exception. This is to be sure the number we substract cannot be less that 0.
			throw new IllegalArgumentException("You are lucky; There is no grade less than 0, otherwise you'd get it!!!!");	
		}
		evaluationNum = newGradeNumber;
	}
	
	public boolean addToGrade() { // This method, because is set to boolean will return a true or false. 
		boolean wasGraded = false; // It declares a boolean set to false
		if(!isMaxGrade()){ // then it checks
			gradeNumber ++;
			wasGraded = true;
		}
		return wasGraded;
	}
	
	public boolean isMaxGrade() {// This method returns true or false after checking if gradeNumber is equal to 10. If it is, it returns true, otherwise it returns false.
		return gradeNumber == 10;
	}
	
	public String getmyJavaText(){// This method returns the value in myJavaText.
		return myJavaText;
	}
}	

//This is my custom made class named Curriculum. The class defines a string with the name myJavaText with the value Texto.

// Because the getter method getmyJavaText(); is inside the scope of the class Curriculum, then it has access to  myJavaText even if myJavaText is private. So we have access but we cannot modify its value. Cool!

// Variables that do not change are refer as constants. You can tell that a variable is a constant because they are all uppercase with the words separeted with underscores.

// A good practice when declaring is to keep things private. You can always change them to public later.