public class Challenge {
    public static void main(String[] args) {
        double fristVal = 20.00;
        double secondVal = 80.00;
        double total = (fristVal + secondVal) * 100;
        System.out.println("Sum = " + total);
        double remainder = total % 23.00;
        System.out.println("The remainder when divided by 23.00 is: " + remainder);
        boolean isRemainderZero = total % 23.00 == 0;
        System.out.println("The remainder when divided by 23.00 is zero: " + isRemainderZero);
        if (!(total % 23.00 == 0)) {
            System.out.println("The remainder when divided by 23.00 is not 0");
        }
    }
}
