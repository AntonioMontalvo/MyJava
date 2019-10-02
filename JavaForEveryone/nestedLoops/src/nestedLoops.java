public class nestedLoops {
    public static void main(String[] arga) {
        System.out.println("***Hello Nested Loops***");
        System.out.println("");

        System.out.println("Nested Loops happen when the body of a loop contains another loop.");
        System.out.println("An application for this would be when creating a table. Let's say that we want to create with \n" +
                "4 columns and four rows per column. The outer loop will be in charge of creating the columns and every time \n" +
                " a column is created, a second loop will create 10 rows.");
        //A TABLE  WITH 4 COLUMNS AND 10 ROWS PER COLUMN. THIS TABLE WILL HOLD THE COLUMN VALUE TO THE POWER OF THE ROW.
        System.out.println("");

        //FIRST WE CREATE A HEADER FOR THE TABLE
        final int numOfColumns = 4;
        final int numOfRows = 10;

        for (int n = 1; n <= numOfColumns; n++) {
            System.out.printf("%10d", n);
        }
        System.out.println();
        for (int n = 1; n <= numOfColumns; n++) {
            System.out.print("        X");
        }
        System.out.println("");
        //Here is the NESTED loop
        for (int x = 1; x <= numOfRows; x++) {
            for (int n = 1; n <= numOfColumns; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
        //OTHER NESTED LOOP EXAMPLES

        System.out.println("Print 3 rows of asterisks");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Print 4 rows of 1,2,3,4  * length");
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Print asterisks in even columns, dashes in odd columns");
        for(int i = 0; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if(j % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}