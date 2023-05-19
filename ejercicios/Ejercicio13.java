import java.util.Scanner;
public class Ejercicio13  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int segundos;
        int minutos;
        int horas;

         System.out.println ("Ingrese los segundos:  ");
         segundos=teclado.nextInt();
         horas=segundos/3600;
         minutos=((segundos-(horas*3600))/60);
         segundos= (segundos-((minutos*60)+(horas*3600)));
         

          System.out.println("los segundos indicados es "+horas + " horas"+ " " +minutos + " minutos" + " " +segundos + " segundos" );









    }
    }