package com.fundamental.stringbasics;

public class StringBasics {
    public static void main(String[]args){
        System.out.println("Hello Strings!");
        System.out.println("Text consist of characters, and a 'String' is a sequence of characters.");
        System.out.println("In Java String are sequences of unicode where each chacater is a value of the type char");
        System.out.println("Strings are held in variables. As with number we must specify that the variables is a string, and it must be named.");
        //Declaration
        System.out.println("***String declaration***");
        String name = "Tony";
        System.out.println("Hi!, my name is " + name + ".");
        //String Methods
        System.out.println("***String Methods***");
            //length()
        System.out.println("Check JavaSE documentation and dive into the String class for complete access to the String methods.");
        System.out.println("For example, you can use the '.length()' method to get the number of characters in a String.");
        System.out.println("The name variable that holds 'Tony' has " + name.length() + " characters.");
        System.out.println("");
            //charAt()
        System.out.println("Use the '.charAt()' method to return the char value at the specified index.");
        char first = name.charAt(0);
        System.out.println("The value of the first characters in the name variable is " + first + ".");
        System.out.println("");
            //substring())
        System.out.println("Another example would be the '.substring()' method. The method Returns a string that is a substring of this string. \n It takes two parameters" +
                "the first int is the starting index of the character in which we want to start the substring and the second int is the index where we are finishing.");
        String greeting = "Hello, World!";
        String sub = greeting.substring(0,6);
        System.out.println("Substring of the greeting String is " + sub);
        //Escape Sequences
        System.out.println("***Escape sequences***");
        System.out.println("Including a quotation in a literal string requires using a backslash \\, \"Hello\"");
        System.out.println("To include a backslash in a String use the sequence \\"+ "\\ like below.");
        System.out.println("C:\\Users\\Antonio\\Documents\\Code\\Software Technologies\\Java\\MyJava\\Strings");
        System.out.println("A very useffull escape is \\"+ "n which denotes a newline character as below.");
        System.out.println("*\n**\n***\n****");
        }
}
