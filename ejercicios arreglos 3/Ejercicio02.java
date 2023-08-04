import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado_texto= new Scanner (System.in);

        System.out.print("Ingrese la cantidad de nombres que dese ingresar: ");
        int n = teclado.nextInt();


        String[] arreglo = new String[n];
       
         
         for (int i = 0; i < n; i++)
         {
          System.out.print("Ingrese el nombre  "+ (i+1) +": ");
            arreglo[i] = teclado_texto.nextLine();  
         }
         System.out.print("Ingrese el nombre que desea encontrar : ");
         String nombre = teclado_texto.nextLine(); 


         for (int i = 0; i < n; i++) {
            if ( arreglo[i].equals( nombre ) ){
          System.out.println("El nombre esta en la posicion: "+(i+1) );
          }
        }
          
    }
}

