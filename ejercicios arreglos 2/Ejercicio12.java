import java.util.Scanner;
import java.util.Random;

public class Ejercicio12{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int size = teclado.nextInt();

        int arreglo [] = new int[size];
        int suma = 0;
        int contPrimo = 0;
        for (  int numero = 0  ; numero < size ; numero++){
            int numero2 = (int) (Math.random ()*1000);
            arreglo[numero]= numero2;
            
                int divisores = 0;
                for ( int i = 1 ; i <= numero2 ;i++ ){
                    if (numero2 % i == 0){
                        divisores++;
                    }
                }
                if (divisores == 2){
                    contPrimo++;
                }
            
          

        }
             System.out.print("La lista de numeros aleatorios generada es ");
        for ( int i = 0 ; i < size; i++ ) {
             System.out.print("[" +arreglo [i]+"] ");
        }
           System.out.println("                    " );
         System.out.print("Los numeros primos en lista de numeros aleatorios generada son " +contPrimo);




    }
}