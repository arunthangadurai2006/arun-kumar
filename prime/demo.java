public class demo{
    public static void main(String[] args) {
        int num = 29; 
        System.out.println(num + (isPrime(num) ? " is a prime number." : " is not a prime number."));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
