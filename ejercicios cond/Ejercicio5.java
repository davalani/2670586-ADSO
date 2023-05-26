import java.util.Scanner;
public class Ejercicio5  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int primer_numero;
        int segundo_numero;
        int tercer_numero;

         System.out.println (" Por favor indicar el primer numero:  ");
         primer_numero=teclado.nextInt();
         System.out.println (" Por favor indicar el segundo numero:  ");
         segundo_numero=teclado.nextInt();
         System.out.println ("Por favor indicar el tercer numero:  ");
         tercer_numero=teclado.nextInt();
         if ( primer_numero < segundo_numero & segundo_numero < tercer_numero ) { 
            System.out.println("Los números se ingresaron en Orden Ascendente.");
         }
         else {
          System.out.println("Los números no se ingresaron en Orden Ascendente.");
         }
        

          









    }
    }