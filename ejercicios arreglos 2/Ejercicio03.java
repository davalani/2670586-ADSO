import java.util.Scanner;
import java.util.Random;

public class Ejercicio03{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int size = teclado.nextInt();

        if (size <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
           
        }

        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.print("Arreglo generado: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        int maximo = arreglo[0];
        for (int i = 1; i < size; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El máximo número es: " + maximo);
    }
}
