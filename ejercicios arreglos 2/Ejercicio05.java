import java.util.Scanner;
import java.util.Random;
public class Ejercicio05 {

public static void main (String [] args) {

 Scanner teclado = new Scanner (System.in);
 System.out.print ("Ingrese un numero: ");
 int size = teclado.nextInt();
 float arreglo [] = new float [size];
 float suma = 0;
 float promedio =0;

     for (  int numero = 0  ; numero < size ; numero++){
            float numero2 = (float) (Math.random ()*1000);
            arreglo[numero]= numero2;

             suma = suma + numero2;

        }
             System.out.print("La lista de numeros aleatorios generada es ");
        for ( int i = 0 ; i < size; i++ ) {
             System.out.print("[" +arreglo [i]+"] ");
        }
        promedio = suma / size;
           System.out.println("                    " );
        System.out.println("La suma de los numeros aleatorios es:  " +suma);
        System.out.println("                    " );
        System.out.println("El promedio de los numeros aleatorios es:  " +promedio);

}



}