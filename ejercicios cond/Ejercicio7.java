import java.util.Scanner;
public class Ejercicio7  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        long numero;
        long digito_1;
        long digito_2;
        long digito_3;
        long digito_4;
        long digito_5;
        long digito_6;
        

         System.out.println ("Hola.. Por favor indicarme un numero:  ");
         numero=teclado.nextLong();

          if (numero  > 999999999 & numero <= 2000000000  ) { 
                    digito_1 = (numero / (500000000*2));
                    digito_2 = (numero % (500000000*2)); 
                    digito_3 = (digito_2 /1000000);
                    digito_4 = (digito_2 % 1000000);
                    digito_5 = (digito_4 / 1000); 
                    digito_6 = (digito_4 % 1000 );
                    System.out.println("Su numero es:  " +digito_1 + "." +digito_3 + "." +digito_5 + "." +digito_6  );
         }
         
         if (numero  > 999999 & numero <= 999999999  ) { 
                    digito_3 = (numero /1000000);
                    digito_4 = (numero % 1000000);
                    digito_5 = (digito_4 / 1000); 
                    digito_6 = (digito_4 % 1000 );
                    System.out.println("Su numero es:  "+digito_3 + "." +digito_5 + "." +digito_6  );
         }
         if (numero  > 999 & numero <= 999999  ) { 
                    digito_5 = (numero / 1000); 
                    digito_6 = (numero % 1000 );
                    System.out.println("Su numero es:  "+digito_5 + "." +digito_6  );
         }

          if (numero  >= 0 & numero <= 999  ) { 
                    System.out.println("Su numero es:  "+numero );
         }
         if (numero >  2000000000  ) { 
                    System.out.println("Escriba un numero inferior a los 2000000000" );
         }







    }
    }