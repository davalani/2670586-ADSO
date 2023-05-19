import java.util.Scanner;
public class Ejercicio5  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        double base;
        double altura;
        double Resultado;

         System.out.println ("Ingrese la base:  ");
         base=teclado.nextDouble();
          System.out.println ("Ingrese la altura ");
         altura=teclado.nextDouble();
         Resultado= (base*altura)/2;
          System.out.println("la respuesta del area del triangulo es :"+Resultado);
    }
}


