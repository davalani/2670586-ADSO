import java.util.Scanner;
public class Entrada  {
    public static void main (String[] args){ 
        Scanner teclado = new Scanner (System.in);
         byte turno;
        short loteria_risaralda  ;
        int saldo_bancario;
        long tarjeta_identidad;
        float nota;
        double pi;
        boolean bandera;
        System.out.println ("Ingrese turno:  ");
        turno=teclado.nextByte();

        System.out.println ("Ingrese Loteria_risaralda:  ");
        loteria_risaralda=teclado.nextShort();

        System.out.println ("Ingrese Saldo_bancario  ");
        saldo_bancario=teclado.nextInt();

        System.out.println ("Ingrese Tarjeta_identidad:  ");
        tarjeta_identidad=teclado.nextLong();

        System.out.println ("Ingrese_nota:  ");
        nota=teclado.nextFloat();

        System.out.println ("Ingrese pi:  ");
        pi=teclado.nextDouble();

        System.out.println ("Ingrese Bandera:  ");
        bandera=teclado.nextBoolean();
         

         System.out.println("                                       " );
         System.out.println("turno: " +turno);
        System.out.println("loteria_risaralda :"+loteria_risaralda);
        System.out.println("saldo_bancario :"+saldo_bancario);
        System.out.println("tarjeta_identidad: "+tarjeta_identidad);
         System.out.println("Nota :"+nota);
        System.out.println("PI: "+pi);
          System.out.println("bandera :"+bandera);
    }
}