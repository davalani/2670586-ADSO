import java.util.Scanner;
import java.util.Random;

public class Ejercicio06{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int size = teclado.nextInt();
        System.out.print("Ingrese un número M: ");
        int m = teclado.nextInt();

        int arreglo [] = new int[size];
        int contador_m=0;

        for (  int numero = 0  ; numero < size ; numero++){
            int numero2 = (int) (Math.random ()*100);
            arreglo[numero]= numero2;
            if (numero2 == m){
                contador_m++;
            }
             

        }
             System.out.print("La lista de numeros aleatorios generada es ");
        for ( int i = 0 ; i < size; i++ ) {
             System.out.print("[" +arreglo [i]+"] ");
        }
           System.out.println("                    " );
           System.out.println("El numero M esta " +contador_m + " veces en el arreglo. ");




    }
}