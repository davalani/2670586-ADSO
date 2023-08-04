import java.util.Scanner;
import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del primer arreglo (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
            return;
        }

        int[] arreglo1 = new int[n];

     
        for (int i = 0; i < n; i++) {
            arreglo1[i] = random.nextInt(100) + 1;
        }

        System.out.print("Primer arreglo generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese el tamaño del segundo arreglo (M): ");
        int m = scanner.nextInt();

        if (m <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
            return;
        }

        int[] arreglo2 = new int[m];

        for (int i = 0; i < m; i++) {
            arreglo2[i] = random.nextInt(100) + 1;
        }

        System.out.print("Segundo arreglo generado: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();

        int[] arregloCombinado = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arreglo1[i] < arreglo2[j]) {
                arregloCombinado[k++] = arreglo1[i++];
            } else {
                arregloCombinado[k++] = arreglo2[j++];
            }
        }

        while (i < n) {
            arregloCombinado[k++] = arreglo1[i++];
        }

        while (j < m) {
            arregloCombinado[k++] = arreglo2[j++];
        }

        System.out.print("Arreglo combinado y ordenado: ");
        for (int idx = 0; idx < arregloCombinado.length; idx++) {
            System.out.print(arregloCombinado[idx] + " ");
        }
        System.out.println();
    }
}
