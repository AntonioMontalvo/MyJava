public class arraysInJava {
    public static void main (String args[]){
        System.out.println("///////////////////////");
        System.out.println("ARRAYS \n" +
                "An Array is a data type to collect large number of values. You want to store the array in a variable, so we can access it. When declaring the array you have to initialize it\n" +
                " with the correct type followed by parenthesis. Inside the parenthesis you should specify the maximum number of elements that the araay will collect. With arrays this number is fixed\n" +
                "as opposed to Array Lists that have a variable number of elements in the collection. Arrays can contain primitives abd objects. ");

        // array declaration
        double[] distances = new double[10];
        //array initialization. when you declare the array you still have to initialise it giving it the number of elements in the array.
        System.out.println("The initial value of the index 5 is " + distances[5]);
        //you can assign a value to a particular index
        distances[0] = 3;
        System.out.println("After assigning a value to index 0, now it reads " + distances[0]);
        //You can declare and initialise a bunch of values just like below
        double[] temperatures = {2, 45, -2.3, 34, 22.9, 48.2};
        System.out.println(" The temperature was "+temperatures[4] + " celsius");
        //You can also make a reference to an existing array
        double[] recordedTemps = temperatures;
        System.out.println(" The temperature now is a reference on the temperatures array at index 2. It is "+temperatures[2] + " celsius");
        ////////////////////
        //LOOPS AND ARRAYS//
        ////////////////////
        System.out.println("////////////////");
        System.out.println("LOOPS AND ARRAYS");
        System.out.println("");
        for(int i = 0; i < temperatures.length; i++){
            System.out.println("I'm index " +i+ " The temperature reads " +temperatures[i]);
        }
        for (double key : temperatures){//for each key in the element array
            System.out.println(key);//show the element, notice there is no index
        }

        ///////////////////////////
        //PARTIALLY FILLED ARRAYS//
        ///////////////////////////
        System.out.println("///////////////////////");
        System.out.println("PARTIALLY FILLED ARRAYS");
        System.out.println("In Java, you have to estimate how many elements an array will have. At the time of initialisation, use that estimate for your array length.\n" +
                "Most likely the array will not be completely filed. When working with partially filled arrays it is good practice " +
                "to keep a COMPANION VARIABLE that contains\n" +
                " the actual number of elements that exist in the array.");
        distances[5] = 57;
        int elementsInDistances = 0; //THIS IS THE COMPANION VARIABLE
        for (int i = 0; i < distances.length; i++){
            System.out.println(distances[i]);
            if(distances[i]>0){
                elementsInDistances++;
                System.out.println("I've found at index " + i + " an element with a value of " + distances[i] + " Now the number of elements in elementsInDistances is " + elementsInDistances);
            }
        }
    int numOfIndexes = distances.length;
        System.out.println("The total number of indexes available in the distances array is " + distances.length + " so we have " + (numOfIndexes-elementsInDistances));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //BASIC ALGORITHMS: FILLING, SUM AND AVERAGE, MAXIMUM AND MINIMUM LINEAR SEARCH, REMOVING AND INSERTING ELEMENTSSWAPPING , COPYING READING INPUT//
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//BASIC ALGORITHMS: FILLING, SUM AND AVERAGE, MAXIMUM AND MINIMUM LINEAR SEARCH, REMOVING AND INSERTING ELEMENTS " +
                "SWAPPING , COPYING READING INPUT//");

        System.out.println("/////////");
        System.out.println("FILLING");
        int filledArray [] = new int[10];
        for( int i = 0; i < 10; i++){
            filledArray[i] = i;
            System.out.println(filledArray[i]);
        }
        System.out.println("///////");
        System.out.println("SUM");
        int sum = 0;
        for(int key : filledArray){
            sum = sum + key;
        }
        System.out.println("The Sum is "+sum);

        System.out.println("///////");
        System.out.println("AVERAGE");
        double avrg = sum/filledArray.length;
        System.out.println("The Average is "+ (avrg));

        System.out.println("///////");
        System.out.println("MAXIMUM");
        double max = 0;
        for (int i = 0; i < temperatures.length; i++){
            if(temperatures[i]> max){
                max = temperatures[i];
            }
        }
        System.out.println("The highest temperature recorded is "+max+ " celsius");

        System.out.println("///////");
        System.out.println("MINIMUM");
        double min = 0;
        for( int i = 0; i < temperatures.length; i++){
            if(temperatures[i] < max){
                max = temperatures[i];
                min = temperatures[i];
            }
        }
        System.out.println("The lowest temperature recorded is " + min);

        System.out.println("///////");
        System.out.println("LINEAR SEARCH");

        double maxTemp = 48.2;
        for(int index = 0; index < temperatures.length; index++){
            if(temperatures[index] == maxTemp){
                System.out.println("Our linear search  found the maximum temperature at index " + index);
                //we are stashing the index with the highest temp to removal. See below Removing an element
            }
        }

        System.out.println("///////////////////////");
        System.out.println("REMOVING ELEMENTS");
        //Let's say you want to remove and index from the array. There are options here.
        //Lets create a new scenario
        int [] paymentsArray ={1324, 4312, 3455, 5231, 5467, 1309, 9837, 0,  };
        int oustedElement = 4312;

        for(int i = 0; i < paymentsArray.length; i++){
            if (paymentsArray[i] == oustedElement){ //this is our linear search. When we find it.
                // Because we found the element we want to work on at this index. We are going to discount -1 to the arr.length counter, and for the remaining
                // elements we assign them to the current index effectively moving the value one index to the left. The last element will show twice, the original and the copy.
                //
                for(int j = i; j <  paymentsArray.length -1; j++){
                    paymentsArray[j] = paymentsArray[j + 1];
                }
                //we are done, lets exit.
                break;
            }
        }

        for(int i = 0; i < paymentsArray.length; i++) {
            System.out.print(" " + paymentsArray[i]);
        }


        System.out.println("///////////////////////");
        System.out.println("INSERTING ELEMENTS");

        //POSSIBILITY #1: Lets insert at the END of the array
        System.out.println("POSSIBILITY #1");

        int newPayment = 3333;
        paymentsArray[(paymentsArray.length-1)] = newPayment;//notice we subtract 1 from the array length to match the corresponding index in the array.

        for(int i = 0; i < paymentsArray.length; i++) {
            System.out.print(" " + paymentsArray[i]);
        }
        System.out.println();

        //POSSIBILITY #2: Lets insert at a given index in the array. Create a NEW Array
        System.out.println("POSSIBILITY #2");
        int anotherNewPayment = 44444;
        int indexPosition = 3;

        //create a new array based on the payments array and add a few more, indexes for comfort.
        int[] newArr = null;
        newArr = new int[paymentsArray.length + 4];

        for (int i = 0; i < paymentsArray.length; i++){
            newArr[i] = paymentsArray[i];
        }
        for (int i = 0; i < newArr.length ; i++) {
            if(i == indexPosition){//when we get to our target index
                for(int j = newArr.length-1; j > 3; j--){ //we start at the end of the array
                    newArr[j] = newArr[j-1]; //the value if the index is the value of the previous index. Shifting everything from the left.
                }
                newArr[indexPosition] = anotherNewPayment;// change the value at indexPosition
            }
        }

        for(int i = 0; i < newArr.length; i++) {//show the result.
            System.out.print(" " + newArr[i]);
        }
        System.out.println("");
        //POSSIBILITY # 3: Let's find a payment amount and insert the new payment immediately before
        System.out.println("POSSIBILITY #3");
        int target = 1309;
        int paymentBefore = 9999;
        int [] newArr2 = null;
        newArr2 = new int [paymentsArray.length + 2];

        for (int i = 0 ; i < paymentsArray.length; i ++){
            newArr2[i] = paymentsArray[i];
        }

        for (int i = 0; i < newArr2.length; i ++){
            if( newArr2[i] == target){

            }
            System.out.print(" "+newArr2[i]);
        }
        System.out.println(" ");
        System.out.println("///////////////////////");
        System.out.println("SWAPPING ELEMENTS");
        //To swap an element it is necessary to create first create a temporary variable. This variable will hold one of the values
        //as a reference. So now we have one value duplicated outside the array and the two original values. Next we make both values to be swapped in the array to be
        //the first value and finally we change the second value to be the one stored in the temporary variable.

        double [] swap2And4 = {2, 43, 11.2, 3, 55.9, 21 };
        double [] tempHold= new double[1];
        System.out.print("The original array");
        for (int i = 0; i < swap2And4.length ; i++) {
            System.out.print(" "+swap2And4[i]);
        }
            tempHold[0] = swap2And4[2];
            swap2And4[2] = swap2And4[4];
            swap2And4[4] = tempHold[0];
            System.out.print(" ");
        System.out.print(" Swapped values");
        for (int i = 0; i < swap2And4.length ; i++) {
            System.out.print(" "+swap2And4[i]);
        }
        ///////////////////////////
        //TWO DIMENSIONAL ARRAYS//
        ///////////////////////////
        System.out.println("///////////////////////");
        System.out.println("TWO DIMENSIONAL ARRAYS");
        //Two dimensional arrays take care of tubular data. The matrix is is capable or storing data in rows and columns
        //like a table. When declaring a two dimensional array you can do it in 2 ways. As one dimension array with  two dimensional arrays you
        //can't change the size

        //The example is for a table of medals in the olympics games.

        final int COUNTRIES = 7;//a total of 7 countries
        final int MEDALS = 3; //three types of medals; gold, silver, bronze

        //now declare the two dimensional array notice we have to [], the first one is rows the second is for columns
        int [] [] medalsAndCountries =  new int[COUNTRIES][MEDALS]; //notice we have to [], the first one is

        ///////////////////////////////////
        //ACCESSING A TWO DIMENSIONAL ARRAY

        //consider array[i][j]
        medalsAndCountries [1][1] = 4;
        System.out.println(medalsAndCountries [1][1]);

        int someNum = COUNTRIES;
        for ( int i = 0; i < COUNTRIES; i++){
            System.out.println(" ");
            for ( int j = 0; j < MEDALS; j++){
                medalsAndCountries [i][j] = someNum + j;
                System.out.print(" " + medalsAndCountries [i][j]);
            }
            someNum = someNum +3;

        }
        System.out.println(" ");
        ///////////////////////////////////
        //ANOTHER TYPE OF DECLARATION TWO DIMENSIONAL ARRAY
        System.out.println("///////////////////////");
        System.out.println("Other declaration.");

        int [][] randomData = {
                {21, 37, 60},
                {43, 0, 2},
                {32, 12, 56}
        };

        for ( int i = 0; i < 3; i ++){
            System.out.println(" ");
            for( int j = 0; j < 3; j++){
                System.out.print(" " + randomData[i][j]);
            }
        }

        ///////////////////////////////////
        //adding all values in row 2
        System.out.println(" ");

        int totalRow2 = 0;
        for (int i = 0; i < randomData.length; i++){
            for (int j = 0; j < randomData.length; j++){
                if (i == 1){
                    totalRow2 = totalRow2 + randomData[i][j];
                }
            }
        }
        System.out.print("total on second row is " + totalRow2);

        ///////////////////////////////////
        //adding all values in column3
        System.out.println(" ");
        int totalcolumn3 = 0;

        for ( int i = 0; i < randomData.length; i++){
            for(int j = 0; j < randomData.length; j++){
                if(j == 2){
                    totalcolumn3 = totalcolumn3 + randomData[i][j];
                }
            }
        }
        System.out.print("total on the third column is " + totalcolumn3);

        System.out.println(" ");
        ///////////////////////////////////
        //CAPTURING AND USING TWO DIMENSIONAL ARRAY PARAMETERS
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println("CAPTURING AND USING TWO DIMENSIONAL ARRAY PARAMETERS");

        int medalsCount [][] = {
                {2,1,3},
                {3,12,0},
                {0,0,1},
                {2,0,0},
                {3,3,1}
        };

        System.out.println("To access the number of columns in our array use medalsCount.length for his case is " + medalsCount.length);
        System.out.println("To access the number of rows in our array use medalsCount[0].length for his case is " + medalsCount[0].length);





    }
}

