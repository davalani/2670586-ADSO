import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la cuadrícula (N): ");
        int N = scanner.nextInt();

        int numPrimo = 2;
        int numNoPrimo = obtenerSiguienteNoPrimo(1);

        // Mostrar la cuadrícula en pantalla
        System.out.println("Cuadrícula NxN:");
        int maxDigits = obtenerCantidadDigitos(N * N * 2);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("[%0" + maxDigits + "d] ", numPrimo);
                    numPrimo = obtenerSiguientePrimo(numPrimo);
                } else {
                    System.out.printf("[%0" + maxDigits + "d] ", numNoPrimo);
                    numNoPrimo = obtenerSiguienteNoPrimo(numNoPrimo);
                }
            }
            System.out.println();
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para obtener el siguiente número primo
    public static int obtenerSiguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    // Método para obtener el siguiente número no primo
    public static int obtenerSiguienteNoPrimo(int numero) {
        int siguiente = numero - 1;
        while (esPrimo(siguiente)) {
            siguiente--;
        }
        return siguiente;
    }

    // Método para obtener la cantidad de dígitos de un número
    public static int obtenerCantidadDigitos(int numero) {
        return String.valueOf(numero).length();
    }
}
