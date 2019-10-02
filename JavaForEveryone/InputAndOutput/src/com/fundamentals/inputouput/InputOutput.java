package com.fundamentals.inputouput;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        System.out.println("***Input and Output***");
        System.out.println("");
        System.out.println("***Input***");
        System.out.println("In order to make our program more flexible, sometime we may want to ask the program user \n" +
                " for input. That input is the stored into a variable. ");
        System.out.println("To take that input we can prompt a message with the 'print()' method like below");
        //////The print method
        System.out.println("");
        System.out.println("//The print() method");

        //Reading keyboard input
        System.out.println("In order to capture input from the keyboard we need to use the Scanner class. \n" + "importing it from its package. " +
                "Along with the Scanner class we use the nextInt() method");



        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of guests for your reservation: ");
        int numOfGuests = in.nextInt();
        System.out.println("Thanks for your reservation, your party of " + numOfGuests + " will be called shortly.");
        System.out.println("");
        /////Controlling Output
        System.out.println("***Controlling the Output***");
        System.out.println("");
        System.out.println("Having the option to control the appearance of our computations is vital when working with specific values. For example express in dollars and cents.");
        System.out.println("");
        System.out.println("We can construct a format specifier for that purpose.");
        double a = 1.54669876;

        System.out.println("");
        System.out.println("Unformatted value of a " + a);
        System.out.println("");
        System.out.printf("Formatted value of a with 2 decimals only is: %8.2f" , a);


    }

}
