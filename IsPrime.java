public class IsPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible by any number other than 1 and n, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.println(number + " is prime: " + isPrime(number));
    }
}