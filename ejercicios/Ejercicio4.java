import java.util.Scanner;
public class Ejercicio4  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int primer_numero;
        int Segundo_numero;
        System.out.println ("Ingrese el primer numero:  ");
         primer_numero=teclado.nextInt();
          System.out.println ("Ingrese el segundo numero ");
         Segundo_numero=teclado.nextInt();
         primer_numero=primer_numero+Segundo_numero;
         Segundo_numero=primer_numero-Segundo_numero;
         primer_numero=primer_numero-Segundo_numero;
         System.out.println("El primer numero es :"+primer_numero);
        System.out.println("El segundo numero es :"+Segundo_numero);


    }
    }