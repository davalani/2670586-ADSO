import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int tamaño = teclado.nextInt();

        int[] arreglo = new int[tamaño];

        System.out.println("Ingrese " + tamaño + " números para llenar el arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = teclado.nextInt();
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

    
        int[] arregloDescendente = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arregloDescendente[i] = arreglo[tamaño - i - 1];
        }

    
        System.out.println("Arreglo en forma descendente:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arregloDescendente[i] + " ");
        }
    }
}
