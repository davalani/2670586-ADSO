import java.util.Scanner;
public class Ejercicio4  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double nota1;
        Double nota2;
        Double nota3;
        Double promedio;

         System.out.println ("Por favor indicarme la primera nota del Estudiante:  ");
         nota1=teclado.nextDouble();

         System.out.println ("Por favor indicarme la segunda nota del estudiante:  ");
         nota2=teclado.nextDouble();
         System.out.println ("Por favor indicarme la  tercera nota  del estudiante:  ");
         nota3=teclado.nextDouble();

         promedio = (nota1+nota2+nota3)/3;


           

          if (promedio >= 7 && promedio <=10 ) { 
         System.out.println("Promedio de notas es:  " +promedio);
            System.out.println("El Estudiante Aprobo");
         }
           else {
            if (promedio >=0   && promedio < 7 ) { 
            
         System.out.println("Promedio de notas es:  " +promedio);
            System.out.println("El Estudiante reprobo");
         }
         }
        
        
      

    }
}
        

          
