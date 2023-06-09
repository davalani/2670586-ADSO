import java.util.Scanner;
public class Ejercicio1  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;

         System.out.println ("Hola.. Por favor indicarme un numero:  ");
         numero=teclado.nextInt();
         if (numero > 0   ) { 
            System.out.println("El numero es positivo");
         }
         else {
            if ( numero < 0  ) { 
            System.out.println("El numero es negativo");
         }
         }

        
         if (numero  == 0 ) { 
            System.out.println("El 0 es un numero neutro");
         }
        
        

          








    }
    }