package day4;

public class MultiplicationTable { // creating the table
    public void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();

            // the explaination
            // if we input  n = 5
            // looping gonna be start with i as a row and starting i = 1 , j as coloumn will looping 1 till 5
            // and the result first row is ( 1 , 2 ,3 )--> this come from i*j and the /t (tab) to make space between the number
        }
    }
}
