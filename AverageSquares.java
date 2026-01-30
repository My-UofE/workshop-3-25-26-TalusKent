import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        int total = 0;
        double iters = 0.0;
        int i = startNum;
        do {
            total += i*i;
            i++;
            iters++;
        }while (i <= endNum);
        System.out.print((double)total/iters);

    }
}