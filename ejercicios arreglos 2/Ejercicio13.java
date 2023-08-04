import java.util.Scanner;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de los arreglos (N): ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
        }

        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[n];
        int[] arregloSuma = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo1[i] = random.nextInt(100) + 1;
            arreglo2[i] = random.nextInt(100) + 1;
        }

        System.out.print("Arreglo 1 generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo 2 generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            arregloSuma[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.print("Arreglo suma: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arregloSuma[i] + " ");
        }
        System.out.println();
    }
}
