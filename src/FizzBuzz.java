import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Parte 1: rango 1–100
        for (int i = 1; i <= 100; i++) {
            System.out.println(checkFizzBuzz(i));
        }

        // Parte 2: rango 1–200
        for (int i = 1; i <= 200; i++) {
            System.out.println(checkFizzBuzzBoom(i));
        }

        // Parte 3: rango personalizado
        System.out.print("Inicio del rango: ");
        int start = sc.nextInt();

        System.out.print("Fin del rango: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(checkFizzBuzzBoom(i));
        }
    }

    // FizzBuzz clásico
    static String checkFizzBuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }

    // FizzBuzzBoom (3, 5 y 7)
    static String checkFizzBuzzBoom(int n) {
        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) return "FizzBuzzBoom";
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        if (n % 7 == 0) return "Boom";
        return String.valueOf(n);
    }
}
