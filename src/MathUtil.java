public class MathUtil {

    // 5 Static Methods

    // 1. Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 3. LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 4. Fibonacci number (nth)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    // 5. Factorial of a number
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    //  Non-static Methods

    // 1. Check if a number is a perfect number
    public boolean isPerfectNumber(int n) {
        if (n < 1) return false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // 2. Sum of digits of a number
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 3. Reverse the digits of a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

//     4. Checks if a number is an Armstrong number.
    public static boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n, digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }


   //   5. Finds the smallest prime number greater than n.
   public static int nextPrime(int n) {
       int next = n + 1;
       while (!isPrime(next)) {
           next++;
       }
       return next;
   }


}
