import java.util.Scanner;
public class Ejercicio17  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int cop;
        Double usd;
        Double eur;
        Double jpy;
        Double gbp;
        

         System.out.println ("Ingrese el valor en pesos colombianos (cop) ");
         cop=teclado.nextInt();
         usd= cop*0.00022;
         eur = cop*0.00021;
         jpy=cop*0.03062;
         gbp=cop*0.00018;

          System.out.println("El cambio en Dolares (USD) es  :"+usd);
          System.out.println("El cambio en Euros es (EUR) :"+eur);
          System.out.println("El cambio en Yen japones (JPY):"+jpy);
          System.out.println("El cambio en Libras esterlinas (GBP):"+gbp);

    }
    }