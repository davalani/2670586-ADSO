import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        if (numero < 2) {
            System.out.println(numero + " no es un número primo.");
        } else {
            int contador = 0;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println(numero + " no es un número primo.");
            } else {
                System.out.println(numero + " es un número primo.");
            }
        }
    }
}
