import java.util.Scanner;

public class Product_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int product1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int product2 = sc.nextInt();
        int product = product1 * product2;
        System.out.println("Product: " + product1 + " * " + product2 + " = " + product);

    }

}
