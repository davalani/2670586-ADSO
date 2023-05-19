import java.util.Scanner;
public class Ejercicio15  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double metros;
        Double centimetros;
        Double pulgadas;
        Double pies;


         System.out.println ("Ingrese la medicion en metros:  ");
         metros=teclado.nextDouble();
         centimetros = metros * 100;
         pulgadas = metros * 39.37;
         pies = metros * 3.28;
        

          System.out.println("la conversion  en centimetros es: :"+centimetros);
          System.out.println("la conversion  en pulgadas es: :"+pulgadas);
          System.out.println("la conversion  en pies es: :"+pies);
         









    }
    }
