import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese el numero de notas que va a ingresar ");
        int numero_notas = teclado.nextInt();

        int cont = 1;
        float suma_notas = 0;

        while (cont <= numero_notas) {
            System.out.print("Nota " + cont + " = ");
            float nota = teclado.nextFloat();
            cont = cont + 1;
            suma_notas = suma_notas + nota;
        }

        float promedio = (suma_notas) / numero_notas;
        System.out.println("El promedio es: " + promedio);

    }
}