import java.util.Scanner;
public class Ejercicio16  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double capital_final;
        int capital_inicial;
        Double tasa_interes;
        int periodo_ahorro;

         System.out.println ("Ingrese la inversión inicial:  ");
         capital_inicial=teclado.nextInt();
          System.out.println ("Ingrese la tasa de interes ");
         tasa_interes=teclado.nextDouble();
         System.out.println ("Ingrese el numero de periodos ");
         periodo_ahorro=teclado.nextInt();
         
         capital_final = (capital_inicial * (Math.pow((1+(tasa_interes/100)) , periodo_ahorro)));
          System.out.println("El monto final es :"+capital_final);









    }
    }
