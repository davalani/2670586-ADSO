import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de 'n' para calcular el término de la sucesión de Fibonacci: ");
        int n = teclado.nextInt();

        int primerDigito = 0;
        int segundoDigito = 1;
        int fibonacci = 0;

        if (n == 1) {
            fibonacci = primerDigito;
        } else if (n == 2) {
            fibonacci = segundoDigito;
        } else {
            for (int i = 3; i <= n; i++) {
                fibonacci = primerDigito + segundoDigito;
                primerDigito = segundoDigito;
                segundoDigito = fibonacci;
            }
        }

        System.out.println("El " + n + " término de la sucesión de Fibonacci es: " + fibonacci);
    }
}
