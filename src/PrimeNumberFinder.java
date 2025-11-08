import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 2;

        System.out.print("How many prime numbers do you want to find? ");
        int maxPrimes = scanner.nextInt();

        System.out.println("First " + maxPrimes + " prime numbers:");

        // TODO: Implement the prime number finding logic here
        while (count < maxPrimes) {
    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.print(number + " ");
        count++;
    }

    number++;
}

        scanner.close();
    }
}