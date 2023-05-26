import java.util.Scanner;
public class Ejercicio6  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        int opcion;
        int digito_1;
        int digito_2;
        int digito_3;
        int digito_4;
        int digito_5;
        int digito_6;

         System.out.println ("Ingrese un  numero de 6 digitos:  ");
         numero=teclado.nextInt();
         System.out.println ("//---------------------------------------//            ");
         System.out.println ("Menù:                                                  ");
         System.out.println ("1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito. ");
         System.out.println ("4. Cuarto Digito. 5. Quinto Digito.  6. Sexto Digito.  ");
         System.out.println ("//---------------------------------------//            ");

         System.out.println ("Escoja una opciòn:  ");
         opcion=teclado.nextInt();


         if (opcion  == 1 ) { 
            digito_1 = (numero % 10 );
            System.out.println("El primer Digito es:" +digito_1);
         }
          if (opcion  == 2 ) { 
            digito_2 = (numero % 100)/10; 
            System.out.println("El segundo Digito es:" +digito_2);
         }
          if (opcion  == 3 ) { 
            digito_3 = (numero % 1000)/100;
            System.out.println("El tercer Digito es:" +digito_3);
         }
          if (opcion  == 4 ) { 
            digito_4 = (numero % 10000)/1000;
            System.out.println("El cuarto Digito es:" +digito_4);
         }

         if (opcion  == 5 ) { 
            digito_5 = (numero % 100000 )/10000;
            System.out.println("El quinto Digito es:" +digito_5);
         }

           if (opcion  == 6 ) { 
            digito_6 = (numero % 1000000 )/100000;
            System.out.println("El sexto Digito es:" +digito_6);
         }
         
          if (opcion  < 1 & opcion > 6) { 
            System.out.println("Escoja una opción correcta.");
         }

    }
    }