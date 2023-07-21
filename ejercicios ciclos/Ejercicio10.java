import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar número: ");
        int n = scanner.nextInt();

        if (n <= 11) {
         int contador = 0;
        int numeroActual = 2;
           System.out.println("Los números primos encontrados son:");
        while (contador < n * n) {
            int i = 2;
            while (i <= Math.sqrt(numeroActual) && numeroActual % i != 0) {
                i++;
            }
            if (i > Math.sqrt(numeroActual)) {
                if(numeroActual<10 && numeroActual >= 0){
                    System.out.print("[" +"00"+ numeroActual + "] ");   
                }
                if(numeroActual>=10 && numeroActual <= 99){
                    System.out.print("[" +"0"+ numeroActual + "] ");   
                }
                if(numeroActual>99 ){
                    System.out.print("[" + numeroActual + "] ");   
                }
                
                contador++;

                if (contador % n == 0) {
                    System.out.println();
                }
            }

            numeroActual++;
        }
            
        } else {
            System.out.println("El número ingresado es demasiado grande. El máximo valor para N es 11.");
        }
    }

    private static void imprimirCuadriculaNumerosPrimos(int n) {
        
    }
}