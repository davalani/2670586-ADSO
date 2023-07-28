import java.util.Scanner;

public class Ejercicio05{

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

        
        System.out.print("Ingrese el número de movimientos de derecha a izquierda: ");
        int numovimientos = teclado.nextInt();

        for (int movimiento = 1; movimiento <= numovimientos; movimiento++) {
            int temp = arreglo[0]; 
            for (int i = 0; i < tamaño - 1; i++) {
                arreglo[i] = arreglo[i + 1]; 
            }
            arreglo[tamaño - 1] = temp; 


            System.out.println("Movimiento " + movimiento + ":");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }
}
