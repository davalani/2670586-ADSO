import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dígitos de la sucesión de Fibonacci a mostrar: ");
        int cantidadDigitos = teclado.nextInt();

        int primerDigito = 0;
        int segundoDigito = 1;
        int fibonacci = 0;

        System.out.print("Sucesión de Fibonacci: " + primerDigito + " " + segundoDigito);

        for (int i = 2; i < cantidadDigitos; i++) {
            fibonacci = primerDigito + segundoDigito;
            System.out.print(" " + fibonacci);
            primerDigito = segundoDigito;
            segundoDigito = fibonacci;
        }
    }
}