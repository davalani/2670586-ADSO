import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero de máximo 6 dígitos: ");
        int numero = scanner.nextInt();
        int j=0;

        while (j != 1) {
        int divisor = 1;
        int temp = numero;

        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }

        while (numero >= 10 && j !=1) {
            int digitoIzquierdo = numero / divisor;
            int digitoDerecho = numero % 10;
            numero = (numero % divisor) / 10;
            divisor /= 100;
            if (digitoIzquierdo != digitoDerecho) {
            System.out.println("El número no es un palíndromo.");
            j=1;
        } else {
            System.out.println("El número  es un palíndromo.");
            j=1;

        }
        
        }
         

    }
        }

       
    }