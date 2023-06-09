import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numero1;
        float numero2;
        float numero3;
        float numero4;
        float maximo;
        System.out.print("Ingrese el primer numero: ");
        numero1 = entrada.nextFloat();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextFloat(); 

        System.out.print("Ingrese el tercer numero: ");
        numero3 = entrada.nextFloat();

        System.out.print("Ingrese el cuarto numero: ");
        numero4 = entrada.nextFloat();

        maximo = numero1;

        if(numero2 > maximo){
            maximo = numero2;
        }

        if(numero3 > maximo){
            maximo = numero3;
        }

        if(numero4 > maximo){
            maximo = numero4;
        }

        System.out.print("El numero maximo es: "+maximo);
    }
}