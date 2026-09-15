import java.util.Scanner;

public class IT26102007Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int num;
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();
            sum = sum + num;
            i++;
        }

        double average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}