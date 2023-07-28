import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = teclado.nextInt();

        int[] arreglo = new int[tamaño];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = teclado.nextInt();
        }

        System.out.print("Ingrese una posición dentro del arreglo (de 1 a " + tamaño + "): ");
        int posicion = teclado.nextInt();

        if (posicion < 1 || posicion > tamaño) {
            System.out.println("Posición fuera de rango. Debe estar entre 1 y " + tamaño);
        }

    
        System.out.println("Arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        System.out.println("Anti horario:  " + posicion + ":");
        for (int i = posicion - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = tamaño - 1; i > posicion - 1; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
