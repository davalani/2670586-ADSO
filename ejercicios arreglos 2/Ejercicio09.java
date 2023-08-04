import java.util.Scanner;
import java.util.Random;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
        }

        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.print("Arreglo generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese el número que desea buscar (M): ");
        int m = scanner.nextInt();
        int posicion = 1;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == m) {
                posicion = i;
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + m + " se encuentra en la posición " + (posicion+1) + " del arreglo.");
        } else {
            System.out.println("El número " + m + " no se encuentra en el arreglo.");
        }
    }
}
