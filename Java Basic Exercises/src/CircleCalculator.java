import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the radius: ");
        float radius = sc.nextFloat();

        double areaOfCircle =  (Math.PI * (radius * radius));
        double perimeter = 2 * Math.PI * radius;

        System.out.println("The area of this circle is: " + areaOfCircle);
        System.out.println("The perimeter of this circle is: " + perimeter);
    }









}
