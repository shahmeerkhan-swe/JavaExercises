public class Calculator_2 {

    public static void main(String[] args) {

        getSum(125, 24);
        System.out.println(getSum(125, 24));
        getSum(125, -24);
        System.out.println(getSum(125, -24));
        getProduct(125, 24 );
        System.out.println(getProduct(125, 24 ));
        getQuotient(125, 24);
        System.out.println(getQuotient(125, 24));
        getRemainder(125, 24);
        System.out.println(getRemainder(125, 24));
    }

    public static String getSum(int x, int y) {

        int sum = x + y;
        return x + " + " + y + " = " + sum;
    }

    public static String getProduct(int x, int y) {

        int product = x * y;
        return x + " * " + y + " = " + product;
    }

    public static String getQuotient(float x, float y) {

        float quotient = x / y;
        return x + " / " + y + " = " + quotient;
    }

    public static String getRemainder(int x, int y) {

        int remainder = x % y;
        return + x + " mod " + y + " = " + remainder;
    }












}
