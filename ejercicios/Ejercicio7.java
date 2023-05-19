import java.util.Scanner;
public class Ejercicio7  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int precio;
        int descuento;
        int Resultado;

         System.out.println ("Ingrese el precio del producto:  ");
         precio=teclado.nextInt();
          System.out.println ("Ingrese el porcentaje de descuento ");
         descuento=teclado.nextInt();

         Resultado=precio-((precio*descuento)/100);
          System.out.println("el precio final es:"+Resultado);









    }
    }