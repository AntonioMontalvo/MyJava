package com.fundamentals.bulean;

import java.util.Scanner;


    public class Bulean {
        public static void main (String[] args){
            System.out.println("Hello Boolean variables and operators!");
            System.out.println("");
            System.out.println("Making complex decisions often require combining Boolean values.\n" +
                    "In Java the boolean data type can be either true or false. The values can be stored in variables e.g.");
            //Boolean variable declaration
            boolean thumbsUp = true;
            //or
            boolean thumbsDown = false;
            System.out.println("The varialble thumbsUp stores a boolean value of " + thumbsUp);
            System.out.println("The varialble thumbsDown stores a boolean value of " + thumbsDown);
            System.out.println("");
            System.out.println("***Boolean operators***");
            System.out.println("Making complex decisions require to combine Boolean values. We use operators for that. \n" +
                    "First let's create two new variables, A is for true and B is for false.");
            System.out.println("");
            //create boolean variables for true and false for operators
            boolean A = true;
            boolean B = false;
            //the && 'and' operator
            System.out.println("***The && 'and' operator***");

            System.out.println("true && true evaluates to " + (A && A) + ".");
            System.out.println("true && false evaluates to " + (A && B) + ".");
            System.out.println("false && true evaluates to " + (B && A) + ".");
            System.out.println("false && false evaluates to " + (B && B) + ".");

            //the || 'and' operator
            System.out.println("");
            System.out.println("***The || 'or' operator***");

            System.out.println("true || true evaluates to " + (A || A) + ".");
            System.out.println("true || false evaluates to " + (A || B) + ".");
            System.out.println("false || true evaluates to " + (B || A) + ".");
            System.out.println("false || false evaluates to " + (B || B) + ".");

            //the ! 'not' operator
            System.out.println("");
            System.out.println("***The ! 'not' operator***");

            System.out.println("!A  evaluates to " + (!A) + ".");
            System.out.println("!B evaluates to " + (!B) + ".");

            //De Morgan's Law
            System.out.println("");
            System.out.println("***De Morgan's Law***");
            System.out.println("Dealing with the ! 'not' operator can be difficult. You must be careful through \n" +
                    " the logic when negating a boolean expression.");
            System.out.println("Let's say we want to apply $20 for shipping if the shipment is not within the continental U.S.");

            //Shipment Simulation

            Scanner in = new Scanner(System.in);
            //get the country
            System.out.print("Please enter country: ");
            String country = in.next();

            //get the state
            System.out.print("Please enter shipping state: ");
            String state = in.next();
            //
            if (!(country.equals("USA") && !state.equals("AK") && !state.equals("HI"))){
                System.out.println("Warning this is not in the continental U.S. We will apply a $20 shipping charge.");
            }
             else {
                System.out.println("This product qualifies for free shipping!");

            }

        }
    }

