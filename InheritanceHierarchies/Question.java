//THIS TYPE/CLASS QUESTION IS DEVELOPED HERE AND IT WILL BE CALLED FROM ANOTHER PROGRAM IN THE SAME inheritanceHierarchies Directory.

public class Question
{
    // Inheritance is the relationship between specialized and general classes. The general class is called a 'Superclass'
    // the specialized is called a 'Subclass'. A good example to illustrate this relationship is to look at the relationship
    // between vehicles and cars as the class Vehicle is the Superclass and the class Car is a subclass of Vehicle.

    // We explore the concept of Inheritance with another example. A quiz consisting of questions, with different types
    // of questions.

    //  At the root of the hierarchy is the Question type. Notice how the class is consider a type.
    // Question becomes the 'Superclass'. As a class it will have a couple of instance variables, a constructor and 4 methods. One to set the question text, one to set the answer, one to check the answer and one to display the question.
    //Two String instance variables
        private String text;
        private String answer;
        private String response;
        //A Constructor to initialize text and answer
        public Question()
        {
            text = "";
            answer = "";
        }
        //A class method that takes an argument to set the question text
        public void setQuestionText(String questionText)
        {
            text = questionText;
        }
        //Another class method to set the answer to the question being asked.
        public void setAnswer(String correctAnswer)
        {
            answer = correctAnswer;
        }
        //A method to check if the answer matches correctAnswer
        public boolean checkAnswer(String response)
        {
            //String itself is a class that inherets from the object superclass, it extends it. The String superclass has many constructors and methods. Here we use one of the methods, String.equals(Object anObject)
            return response.equals(answer);
        }
        //A method to display the question.
        public void display()
        {
            System.out.println(text);
        }
    }


//compile Inheritance.java and OneQuestion.java
// javac Inheritance.java
// javac OneQuestion.java
//run java OneQuestion