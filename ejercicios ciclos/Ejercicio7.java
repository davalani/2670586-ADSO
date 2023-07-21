import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

        int mcm = 1;

        int maximo = numero1;
        if (numero2 > maximo) {
            maximo = numero2;
        }
        if (numero3 > maximo) {
            maximo = numero3;
        }

        int i = 2;
        while (i <= maximo) {
            if (numero1 % i == 0 || numero2 % i == 0 || numero3 % i == 0) {
                mcm *= i;

                if (numero1 % i == 0) {
                    numero1 /= i;
                }
                if (numero2 % i == 0) {
                    numero2 /= i;
                }
                if (numero3 % i == 0) {
                    numero3 /= i;
                }
            } else {
                i++;
            }
        }

        System.out.println("El MCM de los tres números ingresados es: " + mcm);
    }

   
}
