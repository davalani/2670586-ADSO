import java.util.Scanner;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
        }

        float[] arreglo = new float[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextFloat() * 100;
        }

        System.out.print("Arreglo generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese el número M: ");
        float m = scanner.nextFloat();
        float valorMasCercano = arreglo[0];
        float distanciaMinima = Math.abs(arreglo[0] - m);

        for (int i = 1; i < n; i++) {
            float distanciaActual = Math.abs(arreglo[i] - m);
            if (distanciaActual < distanciaMinima) {
                distanciaMinima = distanciaActual;
                valorMasCercano = arreglo[i];
            }
        }

        System.out.println("El valor más cercano a " + m + " en el arreglo es: " + valorMasCercano);
    }
}
