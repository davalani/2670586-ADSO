import java.util.Scanner;
public class Ejercicio12  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double ancho;
        Double largo;
        Double area;
       

         System.out.println ("Ingrese la medida del ancho del rectangulo:  ");
         ancho=teclado.nextDouble();
          System.out.println ("Ingrese la medida del largo del rectangulo: ");
         largo=teclado.nextDouble();

         area= ancho * largo;
          System.out.println("El area del rectangulo es :"+area);









    }
    }