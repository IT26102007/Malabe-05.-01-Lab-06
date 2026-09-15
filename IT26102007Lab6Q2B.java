import java.util.Scanner;

public class IT26102007Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }

        System.out.println("\nYou entered:");

        i = 0;
        while (i < 10) {
            System.out.println(numbers[i]);
            i++;
        }

        input.close();
    }
}