import java.util.Scanner;
public class Ejercicio3  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double x;
        Double y;

         System.out.println ("Por favor indicar el numero en x:  ");
         x=teclado.nextDouble();
         System.out.println ("Por favor indicar el numero en y:  ");
         y=teclado.nextDouble();
         if (x > 0 & y > 0 ) { 
            System.out.println("Las coordenadas estan en el cuadrante 1");
         }
    
           if (x < 0 & y > 0 ) { 
            System.out.println("Las coordenadas estan en el cuadrante 2");
         }

          if (x < 0 & y < 0 ) { 
            System.out.println("Las coordenadas estan en el cuadrante 3");
         }
          if (x > 0 & y < 0 ) { 
            System.out.println("Las coordenadas estan en el cuadrante 4");
         }
        
         if (x == 0 & y == 0 ) { 
            System.out.println("Las coordenadas estan en el origen");
         }
          if (x == 0 & y > 0 ) { 
            System.out.println("Las coordenadas estan en el eje y");
         }
         if (x > 0 & y == 0 ) { 
            System.out.println("Las coordenadas estan en el eje x");
         }
         if (x == 0 & y < 0 ) { 
            System.out.println("Las coordenadas estan en el eje y");
         }
         if (x < 0 & y == 0 ) { 
            System.out.println("Las coordenadas estan en el eje x");
         }

          









    }
    }