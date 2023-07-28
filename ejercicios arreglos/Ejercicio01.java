import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        int impar=1;
     

        int[] arreglo = new int[numero];

        for (int i = 0; i < numero; i++) {
            
            arreglo[i] = impar;
            impar += 2;
        }

           if (numero <= 0) {
            System.out.println("El número debe ser mayor que cero.");
            return;
        }

        System.out.println("El arreglo de números impares es:");
        for (int i = 0; i < numero; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
