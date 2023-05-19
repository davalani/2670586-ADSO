import java.util.Scanner;
public class Ejercicio20  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        int digito_1;
        int digito_2;
        int digito_3;
        int digito_4;
        int digito_5;
        int Resultado;

         System.out.println ("Ingrese un  numero de 5 digitos:  ");
         numero=teclado.nextInt();
         digito_1=  (numero % 100000 )/10000;;
         digito_2=  (numero % 10000)/1000;;
         digito_3= (numero % 1000)/100;
         digito_4= (numero % 100)/10; 
         digito_5= (numero % 10 );

         Resultado = digito_1 + digito_2 + digito_3 + digito_4 + digito_5 ;
          System.out.println("la respuesta de la suma de :"+digito_1 +  "+" +digito_2 + "+" +digito_3 + "+" +digito_4 + "+" +digito_5 +" "+ " es: " +Resultado );









    }
    }


