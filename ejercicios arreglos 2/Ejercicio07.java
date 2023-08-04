import java.util.Scanner;
import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
        }

        int arreglo [] = new int[size];

        for (int i = 0; i < size; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.print("Arreglo original: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();


        int[] arregloInverso = new int[size];
        for (int i = 0; i < size; i++) {
            arregloInverso[i] = arreglo[size - 1 - i];
        }

        System.out.print("Arreglo inverso: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arregloInverso[i] + " ");
        }
        System.out.println();
    }
}
