import java.util.Scanner;
public class Ejercicio2  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        double Celcius;
        double F;
         System.out.println ("Ingrese la temperatura en grados celcius:  ");
         Celcius=teclado.nextDouble();
         F= (Celcius * (9/5))+32;
         System.out.println("la temperatura en grados Fahrenheit es :"+F);


    }
}