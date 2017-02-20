import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
      	Console console = System.console();
			    
      	console.printf("Hello, my name is Tony\n");//the f in printf is for format. The \n is scape like <br>
			
		String name = "Alejandrina";  
      	console.printf("Hi %s\n", name); //%s is the format specifier where "s" stands for String. Is a place holder for name.
			
      	console.printf("To compile it run javac <file name> e.g  javac Introduction.java\n");
      	console.printf("Then run java introduction\n");
			
		String yourName = console.readLine("What is your name\n> "); //readLine will take input in the command line and output a formatted version
		console.printf("Your name is %s\n", yourName);
  }
}
