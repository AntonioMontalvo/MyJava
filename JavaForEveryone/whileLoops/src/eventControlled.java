import java.util.Scanner;

public class eventControlled {
    public static void main (String[] args){
        System.out.println("***Introduction***");
        System.out.println("");
        System.out.println("Hello While Loops!");
            System.out.println("In a loop a part of a program is repeated over and over until a specific goal is reached.");
        System.out.println("While loops are used when a set of instructions is to be executed until a goal \n" +
                " has been reached. That is 'while' a condition is true. While loops are also called event controlled loops");
        System.out.println("");
        System.out.println("***Example***");
        System.out.println("A program that computes the time required to double an investment will execute a set of statments \n" +
                "until the investment is doubled.");
        System.out.println("");
        //Initialize the year
        int year = 0;

        //capture the initial value
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your initial investment amount: " );
        final double INITIAL_VALUE = in.nextDouble();
        System.out.println("");
        System.out.printf("Your initial investment is $%.2f", INITIAL_VALUE );

        //capture the desired target value
        System.out.println("");
        System.out.print("Please enter your desired total amount: ");
        final double DESIRED_VALUE = in.nextDouble();
        System.out.println("");
        System.out.printf("Your desired amount is $%.2f", DESIRED_VALUE);

        //Capture the interest rate
        System.out.println("");
        System.out.print("What is the interest rate?: ");
        final double INTEREST_RATE = in.nextDouble();
        System.out.println("");
        System.out.printf("Your interest rate is %.2f" , INTEREST_RATE );
        System.out.print("%");

        // set the balance for
        double balance = INITIAL_VALUE;

        //now we create the while loop

        while (balance < DESIRED_VALUE){
            year++;
            double interest = balance * INTEREST_RATE /100;
            balance = balance + interest;
            System.out.println("");
            //System.out.printf("For year %.2f", year);
            System.out.printf(", the interest is $%.2f", interest);
            System.out.printf(". The balance is $%.2f", balance);
        }
        System.out.println("");
        System.out.println("The initial investment double after " + year + " years.");
    }
}
