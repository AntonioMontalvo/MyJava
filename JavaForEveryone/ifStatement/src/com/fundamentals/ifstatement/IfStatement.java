package com.fundamentals.ifstatement;

import java.util.Scanner;
public class IfStatement {
    public static void main (String[] args){
        System.out.println("Hello if statement!");
        System.out.println("");
        System.out.println("The if statement is used to implement decisions, so that when a condition is fulfilled, \n" +
                "one set of statements is executed, otherwise another set of statements is executed.");

        //***********************************
        //Elevator example
        //***********************************
        System.out.println("***Elevator simulation***");
        System.out.println("In an elevator the number 13 is regularly omitted. This programs skips the 13th floor.");

        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();
        //Here we adjust the floor with an if statement

        int actualFloor;

        if(floor > 13) { //if this is true
            actualFloor = floor -1;
        } else { //otherwise
            actualFloor = floor;
        }
        System.out.println("The elevator will travel to the actual floor " + actualFloor);

        //***********************************
        //Multiple alternatives with else if
        //***********************************
        System.out.println("");
        System.out.println("***Multiple Alternatives using else if***");
        System.out.println("In many situations we have to make decisions with more than just two cases.");
        System.out.println("Imagine we want to create a prigram to show a message describing the strength of an earthquake \n" +
                " as measured by the Richter scale. A rule of thumb here is to test general conditions after more specific \n" +
                " conditions, that is test the more specific conditions first.");
        System.out.println("");
        //Grab the users input for the Richter scale.
        Scanner user = new Scanner(System.in); //notice the creation of the new object assigned to the Richter scales
        System.out.print("Enter the number of the earthquake scale value from 0 to 10: ");
        int scaleValue = user.nextInt();//using the nextInt() method we ensure the input is an int
        if (scaleValue > 9) {
            System.out.println("A value of " + scaleValue + " in the Richter scale shows that most structures are expected to fall.");
        } else if (scaleValue >= 7) {
            System.out.println("A value of " + scaleValue + " in the Richter scale shows that many building will experience major damage.");
        } else if (scaleValue >= 6) {
            System.out.println("A value of " + scaleValue + " in the Richter scale shows that many building will suffer considerable damage.");
        } else if (scaleValue >=5) {
            System.out.println("A value of " + scaleValue + " in the Richter scale shows minor damage to structures.");
        } else {
            System.out.println("A value of " + scaleValue + " in the Richter scale shows no damage to buildings.");
        }

        //***********************************
        //Nested Branches
        //***********************************
        System.out.println("");
        System.out.println("***Nested Branches***");
        System.out.println("It is possible and sometimes necessary to have an if statemengt inside another. This type of nested decisions are required \n" +
                " to solve probles that have two or more levels of decision making.");

        //A two level decision making example The Income Tax.

        System.out.println("Computing taxes requires two levels of decision making. First we need to decide on marital status. \n" +
                "After marital status we must figure the income bracket.");

        System.out.println("");
        System.out.println("***A two level decision making example The Income Tax***");
        //Capture the marital status
        Scanner maritalStatus = new Scanner(System.in);
        System.out.print("Please enter 's' if filing single or 'm' if filing married: ");
        String status = maritalStatus.next();
        System.out.println("You have entered " + status + " for your marital status.");

        //Capture Income amount
        System.out.print("Enter you total income: ");
        double totalIncome = in.nextDouble();
        System.out.println("We will use $" + totalIncome + " amouunt as your total income.");

        // Let's create a few constants for the different rates.
        final double RATE1 = 0.10;
        final double RATE2 = 0.25;
        final double MAX_AMOUNT_FOR_RATE1_SINGLE = 32000;
        final double MAX_AMOUNT_FOR_RATE1_MARRIED = 64000;

        //Let's create variable to stores our results
        double tax1  = 0;
        double tax2 = 0;

        System.out.println("Once we collect the data, we are ready to implement our decision process.");

        if(status.equals("s")){
            if (totalIncome <= MAX_AMOUNT_FOR_RATE1_SINGLE){
                tax1 = RATE1 * totalIncome;
            } else {
                tax1 = RATE1 * MAX_AMOUNT_FOR_RATE1_SINGLE;
                tax2 = RATE2 *( totalIncome - MAX_AMOUNT_FOR_RATE1_SINGLE);
            }
        } else {
            if (totalIncome <= MAX_AMOUNT_FOR_RATE1_MARRIED) {
                tax1 = RATE1 * MAX_AMOUNT_FOR_RATE1_MARRIED;
            } else {
                tax1 = RATE1 * MAX_AMOUNT_FOR_RATE1_MARRIED;
                tax2 = RATE2 * (totalIncome - MAX_AMOUNT_FOR_RATE1_MARRIED);
            }
        }
        double totalTaxDue = tax1 + tax2;
        System.out.println("The total tax due is $ " + totalTaxDue);
        }
}
