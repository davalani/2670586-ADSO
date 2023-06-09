import java.util.Scanner;
public class Ejercicio8  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double base;
        Double altura;
        Double area;

         System.out.println ("Hola.. Por favor indicarme la base del triangulo:  ");
         base=teclado.nextDouble();

         System.out.println (" Por favor indicarme la altura del triangulo:  ");
         altura=teclado.nextDouble();
         if (base > 0  && altura > 0  ) { 
            area= (base*altura)/2;
            System.out.println("El area del triangulo es:  " +area);
         }
         else {
            System.out.println("Por favor  la base o la altura deben ser cantidades positivas");
         }

          if (base <= 0  && altura <= 0  ) { 
            System.out.println("No se aceptan la base y altura menores o iguales a 0  " );
         }

         
    
        

          








    }
    }