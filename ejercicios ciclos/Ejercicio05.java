import java.util.Scanner;
public class Ejercicio05{
	public static void main(String[] args) {	
           Scanner teclado= new Scanner (System.in);
           System.out.println ("ingrese un numero N: ");
           int numero = teclado.nextInt();
            System.out.println ("Factorial: ");
                   int j=1;
                      for ( int i = 1; i <= numero ; i++) {
                          
                          j=j*i;
                          System.out.print (i);
                          
                       
                          if (i < numero) {
                            System.out.print ("x");
                          }
                          if (i == numero) {
                    
                            System.out.println ("="+j);
                          }
                          
            
                        }
                          

                        
                       
                

         
    }
}