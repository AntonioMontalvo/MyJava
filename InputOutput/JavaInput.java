// In order to read text files, the most convinient mechanism is to use the Scanner class. To read input from the console use the Scanner class. To read input from a disk file you have to add the File class to the mix.

import java.io.File;
//If the input or output file for a Scanner doesn't exist a FileNotFoundException occurs when the Scanner object is constructed. The compiler shows an error. We must indicate how to handle this situation.
import java.io.IOException;// Import the IOException class to handle errors.
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

public class JavaInput
{
    public static void main(String[] args)
    {
        //this section creates a File for our text if it doesn't exist showing a message confirming the creation of the file. If it does exists, it shows a message saying the file already exists. I there is an error it shows an error occured. We use a try catch Statement
        try
        {
            File texto = new File("InputInJava.txt");//File Object

            if (texto.createNewFile())
            {
                System.out.println("File created: " + texto.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }

            String fileContent = "Hello there, this text comes from the JavaInput.java fileContent variable.";

            //Constructs a FileWriter object given a File object.
            FileWriter fileWriter = new FileWriter(texto);

            // Creates a new PrintWriter, with the specified file.
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(fileContent);
            printWriter.println("This text is pinted using the printf method available for PrintWriter.");


            //Capture user's input to the text file.
            System.out.print("Enter Text and click Enter: ");
            Scanner scan = new Scanner(System.in);
            String userText = scan.nextLine();
            printWriter.println(userText);

            printWriter.close();//Closes the stream, flushing it first.


            //Read text from txt file

            Scanner textReader = new Scanner(texto);

            while (textReader.hasNextLine())
            {
                //String wordsInFile = textReader.next();
                System.out.println(textReader.nextLine());

            }


        }


        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}