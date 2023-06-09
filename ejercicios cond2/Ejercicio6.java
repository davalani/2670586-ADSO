import java.util.Scanner;
public class Ejercicio6  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int edad;

         System.out.println ("Hola.. Por favor indicarme su edad:  ");
         edad=teclado.nextInt();
          if (edad  > 100 ) { 
            System.out.println("Ponga una edad correcta");
         }
         if (edad  <= 0 ) { 
            System.out.println("Ponga una edad correcta");
         }
         if (edad >= 18 && edad <=100  ) { 
            System.out.println("Usted es mayor de edad, puede votar");
         }
         else {
            if ( edad < 18 && edad > 0  ) { 
            System.out.println("Usted es menor de edad, No puede votar");
         }
         }
         
        

        
        

          








    }
    }