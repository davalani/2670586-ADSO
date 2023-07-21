import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print(" Ingrese el numero de materias: ");
        int numero_materias = teclado.nextInt();

        float suma_creditos = 0;
        float nota_por_credito = 0;
        float suma_nota_creditos = 0;

        for (int cont = 1; cont <= numero_materias; cont++) {
            System.out.print("Nota Materia " + cont + " = ");
            float nota = teclado.nextFloat();

            System.out.print("Credito Materia " + cont + " = ");
            float credito = teclado.nextFloat();

            nota_por_credito = nota * credito;
            suma_nota_creditos = suma_nota_creditos + nota_por_credito;
            suma_creditos = suma_creditos + credito;
        }

        float promedio = suma_nota_creditos / suma_creditos;
        System.out.println("El promedio ponderado es: " + promedio);

    }
}