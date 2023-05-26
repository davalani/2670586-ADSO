import java.util.Scanner;
public class Ejercicio1  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int edad;

         System.out.println ("Hola.. Por favor indicarme su edad:  ");
         edad=teclado.nextInt();
         if (edad  >= 18 & edad <= 100  ) { 
            System.out.println("Paga un impuesto de $ 200.000");
         }
         else {
            if (edad  > 0 & edad <= 17  ) { 
            System.out.println("recibe un auxilio de $ 800.000");
         }
         }

        
         if (edad  >= 100 ) { 
            System.out.println("Ponga una edad correcta");
         }
         if (edad  <= 0 ) { 
            System.out.println("Ponga una edad correcta");
         }
        

          








    }
    }