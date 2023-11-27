import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {

        System.out.println("Hello, please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Hello " + userName);
    }
}
