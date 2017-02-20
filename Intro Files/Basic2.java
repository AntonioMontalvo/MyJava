import java.io.Console;
 
public class Basic2 {
    
    public static void main(String[] args) {
      Console console = System.console();
			
			String ageAsString = console.readLine("How old are you?");//We capture the input from terminal and stash it in a variable.
			
			int age = Integer.parseInt(ageAsString);//we use parseInt to convert The input String as an integer 
			
			if(age < 13){ //if statement
				console.printf("Sorry you must be at least 13 to run this program.\n");
				//This is the exit method.
				System.exit(0);
			}
        
			String name = console.readLine("Enter your name: ");
			String adverb = console.readLine("Enter an adverb: ");
			
			String noun = console.readLine("Enter an noun: ");
			if(noun.equalsIgnoreCase("dork")){//here we use a string method to see if noun is equal to "dork"
				console.printf("That language is not allowed! .\n");//the method returns true if we have a match
			System.exit(0);	//so we exit the app
			}
			
			String color;
			boolean isInvalidWord;
			do {
				color = console.readLine("Enter a color: ");
			 isInvalidWord =  (color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green"));
				
				if(isInvalidWord){
					console.printf("That color sucks, try another that I like!! .\n");
				}
			} while(isInvalidWord);
			
			
			String verb = console.readLine("Enter an verb: ");
			
			console.printf("%s is very %s\n", name, adjective);
			console.printf("%s is very %s\n", adverb,verb);
			
    } 
}