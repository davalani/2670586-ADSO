import java.util.Scanner;
public class Ejercicio6  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        double primera_nota;
        double segunda_nota;
        double tercera_nota;
        double cuarta_nota;
        double quinta_nota;
        double nota_final;

         System.out.println ("Ingrese la  primer nota:  ");
         primera_nota=teclado.nextDouble();
          System.out.println ("Ingrese la  segundo nota: ");
         segunda_nota=teclado.nextDouble();
          System.out.println ("Ingrese la  tercera nota:  ");
         tercera_nota=teclado.nextDouble();
          System.out.println ("Ingrese la  cuarta nota: ");
         cuarta_nota=teclado.nextDouble();
         System.out.println ("Ingrese la  quinta nota: ");
         quinta_nota=teclado.nextDouble();

         nota_final=(primera_nota + segunda_nota + tercera_nota + cuarta_nota + quinta_nota)/5;
          System.out.println("la nota definitiva es :"+nota_final);









    }
    }