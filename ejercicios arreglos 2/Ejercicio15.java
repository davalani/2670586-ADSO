import java.util.Scanner;

public class  Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que cero.");
            return;
        }

        int[] arreglo = new int[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int esPalindromo = 1;
        for (int i = 0; i < n / 2; i++) {
            if (arreglo[i] != arreglo[n - i - 1]) {
                esPalindromo = 0;
                break;
            }
        }

       
        if (esPalindromo == 1) {
            System.out.println("El arreglo es un palíndromo.");
        } else {
            System.out.println("El arreglo NO es un palíndromo.");
        }
    }
}
