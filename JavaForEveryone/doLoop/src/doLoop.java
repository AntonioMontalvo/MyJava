import java.util.Scanner;
public class doLoop {
    public static void main (String[] args){
        System.out.println("Hello do-Loops!");
        System.out.println("");
        System.out.println("***Introduction***");
        System.out.println("In a loop a part of a program is repeated over and over until a specific goal is reached.");
        System.out.println("The do Loop  is appropriate when you want to execute the body of the loop at least once, performing the test of the condition \n" +
                " after the execution. In contrast the while and for loopsare pre-test loops.");
        System.out.println("");
        //Case study
        System.out.println("***Usage***");
        System.out.println("A typical example is for input validation.\n" +
                "Suppose you ask a user to enter a value < 100. Until the value < 100 the program will keep asking.");
        //Our do loop
    Scanner in = new Scanner(System.in);
    int num;
    do {
        System.out.print("Please enter a number below 100: ");
        num = in.nextInt();
        } while (num < 100);
    }
}
