import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 6: ");
        int N = teclado.nextInt();

        int variable = 0;
        int multiplicacion = 0;

        for (int i = 0; i < N; i++) {
            int numeroAleatorio = (int) (Math.random() * 10);
            variable = variable * 10 + numeroAleatorio;
        }

        multiplicacion = variable * 2;

        System.out.println("Variable: " + variable);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
    }
}