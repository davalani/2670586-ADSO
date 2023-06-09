import java.util.Scanner;
public class Ejercicio5  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int primer_numero;

         System.out.println ("Ingrese un año:  ");
         primer_numero=teclado.nextInt();
         if (primer_numero % 4 == 0 ) { 
            System.out.println("El año es Bisiesto");
         }
         else {
              System.out.println("El año no es Bisiesto");
         }

          









    }
    }