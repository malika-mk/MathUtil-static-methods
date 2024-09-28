
import java.util.Scanner;
public class Main {
    // Main method to test the class
    public static void main(String[] args) {
        // Testing Static Methods
        System.out.println("Static Methods:");

        // 1. Check if a number is prime
        System.out.println("isPrime(7): " + MathUtil.isPrime(7));
        System.out.println("isPrime(4): " + MathUtil.isPrime(4));
        System.out.println("isPrime(11): " + MathUtil.isPrime(11));

        // 2. GCD of two numbers
        System.out.println("gcd(54, 24): " + MathUtil.gcd(54, 24));
        System.out.println("gcd(10, 110): " + MathUtil.gcd(10, 110));
        System.out.println("gcd(40, 36): " + MathUtil.gcd(40, 36));

        // 3. LCM of two numbers
        System.out.println("lcm(5, 25): " + MathUtil.lcm(5, 25));
        System.out.println("lcm(10, 33): " + MathUtil.lcm(10, 33));
        System.out.println("lcm(7, 22): " + MathUtil.lcm(7, 22));

        // 4. Fibonacci number (nth)
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7));
        System.out.println("fibonacci(5): " + MathUtil.fibonacci(5));
        System.out.println("fibonacci(1): " + MathUtil.fibonacci(1));

        // 5. Factorial of a number
        System.out.println("factorial(10): " + MathUtil.factorial(10));
        System.out.println("factorial(5): " + MathUtil.factorial(5));
        System.out.println("factorial(4): " + MathUtil.factorial(4));



        // Create an object for non-static methods
        MathUtil mathUtil = new MathUtil();

        // 1. Check if a number is a perfect number
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));
        System.out.println("isPerfectNumber(8): " + mathUtil.isPerfectNumber(8));
        System.out.println("isPerfectNumber(36): " + mathUtil.isPerfectNumber(36));

        // 2. Sum of digits of a number
        System.out.println("sumOfDigits(123): " + mathUtil.sumOfDigits(123));
        System.out.println("sumOfDigits(6767): " + mathUtil.sumOfDigits(6767));
        System.out.println("sumOfDigits(3465): " + mathUtil.sumOfDigits(3465));

        // 3. Reverse the digits of a number
        System.out.println("reverseNumber(2006): " + mathUtil.reverseNumber(2006));
        System.out.println("reverseNumber(9944): " + mathUtil.reverseNumber(9944));
        System.out.println("reverseNumber(1818): " + mathUtil.reverseNumber(1818));

        // 4. Checks if a number is an Armstrong number.
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153));
        System.out.println("isArmstrongNumber(144): " + mathUtil.isArmstrongNumber(144));
        System.out.println("isArmstrongNumber(188): " + mathUtil.isArmstrongNumber(188));

        // 5. Finds the smallest prime number greater than n.
        System.out.println("nextPrime(14): " + mathUtil.nextPrime(14));
        System.out.println("nextPrime(111): " + mathUtil.nextPrime(111));
        System.out.println("nextPrime(2024): " + mathUtil.nextPrime(2024));


    }
}
