import java.util.Scanner;
public class Ejercicio4  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int primer_numero;
        int segundo_numero;
        int tercer_numero;

         System.out.println ("Indicar por favor el primer numero:  ");
         primer_numero=teclado.nextInt();
          System.out.println ("Indicar por favor el segundo numero:  ");
         segundo_numero=teclado.nextInt();
          System.out.println ("Indicar por favor el tercer numero:  ");
         tercer_numero=teclado.nextInt();
         if (primer_numero  > segundo_numero  & primer_numero > tercer_numero) { 
            System.out.println("El numero mayor es " +primer_numero);
         
         }
         else {
           if (segundo_numero  > primer_numero  & segundo_numero > tercer_numero) { 
            System.out.println("El numero mayor es " +segundo_numero);
             } 
         
         else {
           if (tercer_numero  > primer_numero  & tercer_numero > segundo_numero) { 
            System.out.println("El numero mayor es " +tercer_numero);
         
         } 
         
         }
        
         
         }
        
        if (primer_numero  < segundo_numero  & primer_numero < tercer_numero) { 
            System.out.println("El numero menor es " +primer_numero);
         
         }
         else {
           if (segundo_numero  < primer_numero  & segundo_numero < tercer_numero) { 
            System.out.println("El numero menor es " +segundo_numero);
             } 
         
         else {
           if (tercer_numero  < primer_numero  & tercer_numero < segundo_numero) { 
            System.out.println("El numero menor es " +tercer_numero);
         
         } 
         
         }
        
         
         }

        if (tercer_numero  = primer_numero  & tercer_numero = segundo_numero) { 
            System.out.println("Los numeros son iguales ");
         
         } 
        
          









    }
    }
    