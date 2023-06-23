import java.util.Scanner;
public class Ejercicio06{
	public static void main(String[] args) {	
           Scanner teclado= new Scanner (System.in);
           System.out.println ("ingrese un numero N: ");
           int numero = teclado.nextInt();
           System.out.println ("ingrese un numero M: ");
           int numero2 = teclado.nextInt();
             for (int cont=numero; cont <= numero2 ; cont++){
                      for ( int i = 1; i <= numero ; i++) {
                          int j=1;
                          j=j+i;
                          System.out.print (i);
                       
                          if (i < numero) {
                            System.out.print ("x");
                          }
                          if (i == numero) {
                    
                            System.out.print ("="+j);
                          }
            
                        }



             }

            
                        
                       
                

         
    }
}