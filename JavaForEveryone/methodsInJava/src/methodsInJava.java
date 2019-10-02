public class methodsInJava{
        public static void main(String[] args) {
         System.out.println("Hello Methods");

         System.out.println("***********************************************\n" +
                    "The keyword static means the object belongs specifically to the class, in this case the methodsInJava class. Void means that the method does not return any values.. \n" +
                    "***********************************************");

          System.out.println("A method is a package where multiples steps are combined for a simple execution. they are \n " +
                  "reusable and return a result to main, which is in itself another method. A method can be use multiple times with different argumentsin the same program or in different programs  \n" +
                  "You should consider a method similar to a Black Box, that has understandable specifications for its use but unknown implementation. \n" +
                  "It is similar to a thermostat. It is easy to set the desired temperature, the AC unit will work to achive that temperature but we don't really know the internal processes \n" +
                  "When creating methods you should name them  with a meaningful name. Methods sometimes have parameter variables that accept inputs as arguments. \n" +
                  "Also try to give a good name to your return variable if it exists. when your method is set to carry out a sequence of instructuins that does not \n" +
                  " yield a value you use the return type VOID to indicatethe absence of the value.");

          System.out.println("***********************************************\n" +
                  "Notice how the cubeVolume method is called below passing the argument with value 4 to the method, Once the method returns the value we use it for printing our sentence. \n" +
                  "***********************************************");
            int result = cubeVolume(4);
            System.out.println("The volume for this cube sideLenght 4 is " + result);

            System.out.println("***********************************************\n" +
                    "One more important concept before we finish our introduction to methods in Java.\n" +
                    "VARIABLE SCOPE: \n" +
                    "The scope of a variable is the part of the program where you can access it. For example if we try to use the result variable like this: \n " +
                    "System.out.println(result);\n" +
                    "It will print 64. However if try to access the volume variable that is part of the cubeVolume method from here 'that is main' we get Error\n" +
                    "because the variable volume is out of scope from the perspective of main. v It is only accessible from within cubeVolume.' " +
                    "***********************************************");

        }
        //this is the cubeVolume() method
        public static int cubeVolume(int sideLength){
            int volume = sideLength * sideLength * sideLength;
            return volume;
        }



}
