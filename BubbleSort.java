package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros: ");
        Integer number = scanner.nextInt();
        List<Integer> numeros = new ArrayList<>(number);

        for (int i = 0; i < number; i++) {
            System.out.println("Ingrese numero " + i + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("Original");
        for (Integer numbers : numeros) {
            System.out.println(numbers);
        }

        List<Integer> ordered = orderBubbleSortMethod(numeros);

        System.out.println("ordenados");
        for (Integer numbers : ordered) {
            System.out.println(numbers);
        }
    }

    public static List<Integer> orderBubbleSortMethod(List<Integer> numeros) {

        for (int j = 0; j < numeros.size() - 1; j++) {
            for (int i = 0; i < numeros.size() - 1; i++) {
                int temp;
                if (numeros.get(i) > numeros.get(i + 1)) {
                    temp = numeros.get(i);
                    numeros.set(i, numeros.get(i + 1));
                    numeros.set(i + 1, temp);
                }
            }
        }
        return numeros;
    }
}