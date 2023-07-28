import java.util.Scanner;

public class Ejercicio02{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int tamaño = teclado.nextInt();

        if (tamaño <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        }

        int[] arreglo = new int[tamaño];

         int contador = 0;
         int cantidadPrimosEncontrados =1 ;

          do{
         for (int numero =1 ; numero < 100; numero++){
            for (int i = 1;  i <= numero; i++){
                        if((numero % i) == 0)
            {
                contador++;
            }

            
            
            }
            i = 1;
            if(contador <= 2)
        {
            arreglo[cantidadPrimosEncontrados] = numero;
            cantidadPrimosEncontrados++;
                
        }
         }
          


 
        
           


        
         System.out.print(arreglo[cantidadPrimosEncontrados] + " ");
        }while (cantidadPrimosEncontrados <= tamaño);
}
          
        } 
        
    
    
