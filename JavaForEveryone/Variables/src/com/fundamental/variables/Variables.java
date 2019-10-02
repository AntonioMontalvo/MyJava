package com.fundamental.variables;

public class Variables {
    public static void main(String[] args){
        System.out.println("***Introduction to variables***");
        System.out.println("A variable is a storage location in a computer program.");
        System.out.println("Each variable has a name and holds a value. Usually you want to initialize it giving it a value.");
        System.out.println("Because each variable stores data of a specify type, you must specify the type.");

        int cansPerPack = 6;
        System.out.println("A pack of soda has " + cansPerPack + " cans in it.");
        System.out.println("");
//Number Types
        System.out.println("***Number Types***");
        System.out.println("Java uses different types of number. You use int to denote a whole number and double for floating point number 'fractional numbers'.");
        double canVolume = 0.335;
        System.out.println("Each can of soda contains " + canVolume + " liters of soda");
        System.out.println("");
//Naming variables
        System.out.println("***Naming variables***");
        System.out.println("When you name a variable, give it a meaningful name, one that explains its purpose. ");
        System.out.println("Variables start with lowercase in camel case style. Classes start with 'Uppercase letter' ");
        System.out.println("");
//The assignment statement
        System.out.println("***The assignment statement***");
        System.out.println("When you see 'int cansPerPack = 6' the assignment operator '=' does not denote mathematical equality.");
        System.out.println("The assignment operator '=' is an instruction to place value into a variable. Place value '6' into the cansPerPack variable");
        System.out.println("");
//Constants
        System.out.println("***Constants***");
        System.out.println("Use 'final' to create a constant. Constants hold values that can never be changed. The afre name using CAPITAL LETTERS.");
        final double BOTTLE_VOLUME = 2;
        System.out.println("Each bottle of soda contain " + BOTTLE_VOLUME + " liters of soda");
//Arithmetic operators
        System.out.println("***Arithmetic operator***");
        int a = 2;
        double b = 3;
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double rem = a % b;
        System.out.println("The addition of 'a' plus 'b' equeals " + sum);
        System.out.println("The subtraction of 'a' minus 'b' equals " + sub);
        System.out.println("The multiplication of 'a' times 'b' equals " + mul);
        System.out.println("The division of 'a' divided by 'b' equals " + div);
        System.out.println("The remainder of the intiger division of 'a' by 'b' equals " + rem);
// Increment and Decrement
        System.out.println("***Increment and Decrement***");
        System.out.println("Use '++' and '--' to add and subtract '1' to a variable. Below we decleare a variable counter and store 0 as its value.");
        int counter = 0;
        counter++;
        System.out.println("I've added 1 to my variable counter and now its value is " + counter);
        counter --;
        System.out.println("After subtracting one from counter, its value goes back to " + counter);


    }

}
