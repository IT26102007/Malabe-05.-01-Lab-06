import java.util.Scanner;

public class IT26102007Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sumSquare = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {
            num = input.nextInt();

            if (num == -99) {
                break; // Stop input
            }

            if (num < 0) {
                System.out.println("Invalid input!");
                continue; // Skip negative numbers
            }

            sumSquare = sumSquare + (num * num);
			  count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquare / count);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }

        input.close();
    }
}