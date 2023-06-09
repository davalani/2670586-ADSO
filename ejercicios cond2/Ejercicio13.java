import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){

        Scanner sistema = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sistema.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0){
            System.out.print("El numero es divisible por 2, 3 y 5");
        }else{
            System.out.print("El numero no es divisible por 2, 3 y 5");
        }

    }
}