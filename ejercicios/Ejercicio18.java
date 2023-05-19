import java.util.Scanner;
public class Ejercicio18  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double peso;
        Double altura;
        Double IMC;

         System.out.println ("Ingrese su peso:  ");
         peso=teclado.nextDouble();
          System.out.println ("Ingrese su altura: ");
         altura=teclado.nextDouble();

         IMC = peso / (Math.pow (altura , 2));
          System.out.println("El indice de su masa corporal es:"+IMC);









    }
    }
