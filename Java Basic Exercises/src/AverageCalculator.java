import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " = " + average);

    }

}
