import java.util.Scanner;

public class Ejemplo {
    public static void main (String [] args){
        
        Scanner entrada = new Scanner (System.in);
        //Crear arreglo

          
        System.out.print("Ingrese cuantos numeros pares desea : ");
        int n = entrada.nextInt();
        int numeros [] = new int [n];
        int n2 = 0;
        System.out.println(" Los numeros pares dados de forma automatica son:  ");

        for (int i = 0; i< numeros.length ; i++){
            n2=n2+2;
            numeros [i]= n2;
        }

       
        for (int i = 0; i< numeros.length ; i++){
            System.out.println("El " +i +" numeros es: " +numeros[i]);
        }

        


        
    }
}