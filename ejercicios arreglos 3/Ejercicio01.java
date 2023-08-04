import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado_texto= new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = teclado.nextInt();


        String[] arreglo = new String[n];
       
         
         for (int i = 0; i < n; i++)
         {
          System.out.print("Ingrese el texto : ");
            arreglo[i] = teclado_texto.nextLine();  
         }

        System.out.println("Arreglo ingresado:");

        for (int i = 0; i < n; i++) {
            System.out.print(" " +arreglo[i]);
        }
    }
}
