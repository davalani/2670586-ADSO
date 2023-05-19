import java.util.Scanner;
public class Ejercicio11  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double radio;
        Double Perimetro;
        Double Area;

         System.out.println ("Ingrese el Radio del circulo:  ");
         radio=teclado.nextDouble();
          
          Perimetro= 2 * 3.1416 * radio ;
          Area=3.1416 * Math.pow(radio , 2);

          System.out.println("El perimetro del circulo es :"+Perimetro);
          System.out.println("El area del circulo es :"+Area);









    }
    }