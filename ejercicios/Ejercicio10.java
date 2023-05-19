import java.util.Scanner;
public class Ejercicio10  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int primer_numero;
        int Segundo_numero;
        double Resultado;
        int restante;

         System.out.println ("Ingrese el primer numero:  ");
         primer_numero=teclado.nextInt();
          System.out.println ("Ingrese el segundo numero ");
         Segundo_numero=teclado.nextInt();

         Resultado=primer_numero / Segundo_numero;
         restante= primer_numero % Segundo_numero;
          System.out.println("la respuesta de la division es :"+Resultado);
           System.out.println("El resto de la division es :"+restante);









    }
    }