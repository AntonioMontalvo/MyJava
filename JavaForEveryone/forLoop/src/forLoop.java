import java.util.Scanner;
public class forLoop {
    public static void main(String[] args){
        System.out.println("***Introduction***");
        System.out.println("");
        System.out.println("Hello for loop!");
        System.out.println("In a loop a part of a program is repeated over and over until a specific goal is reached.");
        System.out.println("The for loop is count-controlled, it is used when a value runs from a starting point \n" +
                "to an ending point with a constant increment or decrement.");
        System.out.println("You know from the out set that the loop body will be executed a definite number of times.");
        System.out.println("");
        //How does it work
        System.out.println("***Execution of a for loop***");
        System.out.println("");
        System.out.println("1. First the counter is initialized. The initialization is executed once, before the loop is entered.");
        System.out.println("2. The condition is checked before each iterarion.");
        System.out.println("3. The body of the loop is executed.");
        System.out.println("4. The counter is updated after each iteration.");
        //An example
        System.out.println("A program prints a table showing the growth of an investment");

        final double RATE = 5;
        final double INITIAL_RATE = 10000;
        double balance = INITIAL_RATE;
        System.out.print("Enter the number of years for your investment: ");
        Scanner in = new Scanner(System.in);
        int nyyears = in.nextInt();
        //This is our for loop
        for(int year = 1; year <= nyyears; year++){
            double interest = balance * RATE /100;
            balance = balance + interest;
            System.out.printf("%4d %10.2f\n", year , balance);
        }
    }
}
