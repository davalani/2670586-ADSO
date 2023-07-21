import java.util.Scanner;
import java.util.Random;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea generar (N): ");
        int N = scanner.nextInt();
        int divisiones = 1;
        int contador = 0;
        int i= 1;
   
        Random random = new Random();
       
        System.out.println("Números primos generados de forma aleatoria:");
        int num = random.nextInt(100);

        while  (i <= N) { 
            
                 for (int j =1 ; j <= num ; j++ ){
                if (num % j == 0) {
                    contador++;
                }
            }

            if (contador <= 2 ) {
                System.out.println("Primo " +i + " Generado -> " +num);
                i=i+1; 

            }
           
                num = random.nextInt(100);
              
            }
            
    }

    }

