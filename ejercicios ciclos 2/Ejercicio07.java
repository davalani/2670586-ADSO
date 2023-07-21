
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero impar: ");
        int numero = scanner.nextInt();

        System.out.println();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado no es impar.");
        }

          int espacios = numero / 2;
          
        int asteriscos = 1;

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < numero / 2) {
                espacios--;
                asteriscos += 2;
            } else {
                espacios++;
                asteriscos -= 2;
            }
        }

        
        espacios = 1;
        asteriscos = numero - 2;

        for (int i = 0; i < numero - 1 && i >=1; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos ; j++) {
                System.out.print("*");
            }

            System.out.println();

            espacios++;
            asteriscos -= 2;
        }
        
          System.out.println();
        

    }
}