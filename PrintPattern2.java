import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 1;
        boolean invalid = true;
        while (invalid) {
            System.out.print("Enter the size: ");
            size = in.nextInt(); // Reads in an int from standard input
            if (size < 1){
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            } else {
                invalid = false;
            }
        }



// Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                System.out.print(col + row -1);
            }
            for (int col = size; col > 0; col--) {
                System.out.print(col + row -1);
            }
            System.out.println("");
        }
        for (int row = size; row > 0; row--) {
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                System.out.print(col + row -1);
            }
            for (int col = size; col > 0; col--) {
                System.out.print(col + row -1);
            }
            System.out.println("");
        }
    }
}