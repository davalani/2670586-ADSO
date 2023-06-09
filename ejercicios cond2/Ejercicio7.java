import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Ingrese un numero entero no mayor a nueve digitos: ");
        int num = entrada.nextInt();
        

        int n1 = num % 10;
        int n2 = (num / 10) % 10;  
        int n3 = (num / 100) % 10;  
        int n4 = (num / 1000) % 10;
        int n5 = (num / 10000) % 10;
        int n6 = (num / 100000) % 10;
        int n7 = (num / 1000000) % 10;
        int n8 = (num / 10000000) % 10;
        int n9 = (num / 100000000) % 10;

        if(num < 999999999){

        if(n1 == n9 && n2 == n8 && n3 == n7 && n4 == n6 ){
            System.out.print("Numero es palindromo");
        }else if(n1 == n8 && n2 == n7 && n3 == n6 && n4 == n5){
            System.out.print("Numero es palindromo");
        }else if(n1 == n7 && n2 == n6 && n3 == n5){
            System.out.print("Numero es palindromo");
        }else if(n1 == n6 && n2 == n5 && n3 == n4){
            System.out.print("Numero es palindromo");
        }else if(n1 == n5 && n2 == n4){
            System.out.print("Numero es palindromo");
        }else if(n1 == n4 && n2 == n3){
            System.out.print("Numero es palindromo");
        }else if(n1 == n3){
            System.out.print("Numero es palindromo");
        }else if(n1 == n2){
            System.out.print("Numero es palindromo");
        }else{
            System.out.print("Numero no es palindromo");
        }

        }else{
            System.out.print("Numero es mayor de nueve digitos");
        }




 
    }   
}