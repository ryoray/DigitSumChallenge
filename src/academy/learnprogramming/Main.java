package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is 1+2+5 = " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 5 is " + sumDigits(5));
        System.out.println("The sum of digits in number 32123 is 3+2+1+2+3 = " + sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125  --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 - 120 = 5

        while (number > 0) {

            // Extract the least significant digit (the last number)
            int digit = number % 10;
            sum += digit;

            // Drop the least significant digit
            number /= 10;
        }

        return sum;
    }
}
