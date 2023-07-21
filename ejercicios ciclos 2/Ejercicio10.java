import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número N: ");
        int n = teclado.nextInt();

        System.out.println("Cuadrado latino:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            int primerNum = n - i + 1;
            for (int j = 1; j <= n; j++) {
                System.out.print(primerNum + " ");
                if (primerNum < n) {
                    primerNum = primerNum + 1;
                } else {
                    primerNum = 1;
                }
            }
            System.out.println();
        }

    }
}
