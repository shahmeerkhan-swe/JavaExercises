import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Please enter the second number: ");
        float num2 = sc.nextFloat();
        float quotient = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + quotient);

    }








}
