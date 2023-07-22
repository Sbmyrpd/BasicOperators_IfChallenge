public class sumRemainder {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 10.3;

        double sum = num1 + num2;

        boolean isRemainderZero = sum % 3 == 0;

        System.out.println("The sum is: " + sum);
        System.out.println("The remainder when divided by 3 is 0: " + isRemainderZero);
    }
}