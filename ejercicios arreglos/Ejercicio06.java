import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
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

        int cantidadPrimos = 0;
        for (int i = 0; i < tamaño; i++) {
             int contador = 0;
        for (int j = 1; j <= arreglo[i]; j++) {
            if (arreglo[i] % j == 0) {
                contador++;
            }
        }
            if (contador == 2) {
                cantidadPrimos++;
            }
        }

        int[] arregloPrimos = new int[cantidadPrimos];
        int[] arregloNoPrimos = new int[tamaño - cantidadPrimos];


        int Primos = 0;
        int NoPrimos = 0;
        for (int i = 0; i < tamaño; i++) {
             int contador = 0;
        for (int j = 1; j <= arreglo[i]; j++) {
            if (arreglo[i] % j == 0) {
                contador++;
            }
        }
            if (contador == 2) {
                arregloPrimos[Primos] = arreglo[i];
                Primos++;
            } else {
                arregloNoPrimos[NoPrimos] = arreglo[i];
                NoPrimos++;
            }
        }
        System.out.println("Arreglo Primos:");
        for (int i = 0; i < cantidadPrimos; i++) {
            System.out.print(arregloPrimos[i] + " ");
        }
            System.out.println();
     
        System.out.println("Arreglo No primos:");
        for (int i = 0; i < tamaño - cantidadPrimos; i++) {
            System.out.print(arregloNoPrimos[i] + " ");
        }
    }
}
