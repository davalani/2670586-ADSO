import java.util.Scanner;
public class Ejercicio10  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double nota5;
        Double promedio;

         System.out.println ("Por favor indicarme la nota de Matematicas del Estudiante:  ");
         nota1=teclado.nextDouble();
         System.out.println ("Por favor indicarme la nota de Español del estudiante:  ");
         nota2=teclado.nextDouble();
         System.out.println ("Por favor indicarme la nota de Ingles del estudiante:  ");
         nota3=teclado.nextDouble();
         System.out.println ("Por favor indicarme la nota de Ciencias naturales del estudiante:  ");
         nota4=teclado.nextDouble();
         System.out.println ("Por favor indicarme la nota de Deportes del estudiante:  ");
         nota5=teclado.nextDouble();
           
         if ( nota1  > nota2 & nota1  > nota3 & nota1  > nota4  & nota1  > nota5  ) { 
            System.out.println("Asignatura con mejor  nota es: Matematicas");
         }
          if ( nota2  > nota1 & nota2  > nota3 & nota2  > nota4  & nota2  > nota5  ) { 
            System.out.println("Asignatura con mejor  nota es Español" );
         }
         
         if ( nota3  > nota1 & nota3  > nota2 & nota3  > nota4  & nota3  > nota5  ) { 
            System.out.println("Asignatura con mejor  nota es Ingles" +nota3);
         }
          if ( nota4  > nota1 & nota4  > nota2 & nota4  > nota3  & nota4  > nota5  ) { 
            System.out.println("Asignatura con mejor  nota es Ciencias Naturales");
         }

          if ( nota5  > nota1 & nota5  > nota2 & nota5  > nota3  & nota5  > nota4  ) { 
            System.out.println("Asignatura con mejor  nota es Deportes");
         }


         if ( nota1  < nota2 & nota1  < nota3 & nota1  < nota4  & nota1  < nota5  ) { 
            System.out.println("Asignatura con menor nota es: Matematicas");
         }
          if ( nota2  < nota1 & nota2  < nota3 & nota2  < nota4  & nota2  < nota5  ) { 
            System.out.println("Asignatura con menor nota es Español" );
         }
         
         if ( nota3  < nota1 & nota3  < nota2 & nota3  < nota4  & nota3  < nota5  ) { 
            System.out.println("Asignatura con menor nota es Ingles" +nota3);
         }
          if ( nota4  < nota1 & nota4  < nota2 & nota4  < nota3  & nota4  < nota5  ) { 
            System.out.println("Asignatura con menor nota es Ciencias Naturales");
         }

          if ( nota5  < nota1 & nota5  < nota2 & nota5  < nota3  & nota5  < nota4  ) { 
            System.out.println("Asignatura con menor nota es Deportes");
         }

         promedio= (nota1+nota2+nota3+nota4+nota5)/5;
         System.out.println("Promedio de notas es:  " +promedio);

         if (promedio <= 3 ) { 
            System.out.println("El numero es par");
         }


    }
}
        

          


