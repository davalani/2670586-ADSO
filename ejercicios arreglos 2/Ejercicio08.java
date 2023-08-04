import java.util.Scanner;
import java.util.Random;

public class Ejercicio08{
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

        System.out.print("Arreglo original: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < size; i++) {
            if (arreglo[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        for (int i = 0; i < size; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[cantidadPares] = arreglo[i];
                cantidadPares++;
            } else {
                impares[cantidadImpares] = arreglo[i];
                cantidadImpares++;
            }
        }
        System.out.print("Números pares: ");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.print("Números impares: ");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}

