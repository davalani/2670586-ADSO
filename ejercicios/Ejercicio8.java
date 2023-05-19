import java.util.Scanner;
public class Ejercicio8  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        String primera_frase;
        String segunda_frase;
        String frase_final;

         System.out.println ("Ingrese la primera frase :  ");
         primera_frase=teclado.nextLine();
          System.out.println ("Ingrese la segunda ");
         segunda_frase=teclado.nextLine();

         frase_final=primera_frase+ " " + segunda_frase;
          System.out.println("la frase final es  :"+frase_final);









    }
    }