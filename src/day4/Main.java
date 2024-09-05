package day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu
        System.out.println("Choose Exercise:");
        System.out.println("1. Table");
        System.out.println("2. stars");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.print("Choose your exercise: ");
        int option = scanner.nextInt();

        switch (option) {
            //task 1
            case 1 :
                System.out.print("input n ( for table n x n ) : ");
                int n = scanner.nextInt();

                MultiplicationTable table = new MultiplicationTable();
                table.printTable(n);
                break;
            //task 2
            case 2 :
                System.out.print("Input the stars iteration : ");
                int star = scanner.nextInt();

                Pattern pattern = new Pattern();
                pattern.printPattern(star);
                break;
            default:
                System.out.println("Invalid Option");

        }
    }
}
