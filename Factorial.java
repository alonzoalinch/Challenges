package challenges;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add a integer number: ");
        int number = scanner.nextInt();

        System.out.println("The Result is: " + calcularFactorial(number));
    }

    public static int calcularFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calcularFactorial(number - 1);
        }
    }
}
