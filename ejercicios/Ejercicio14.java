import java.util.Scanner;
public class Ejercicio14  {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        double primera_nota;
        double segunda_nota;
        double tercera_nota;
        double promedio;
        int creditos_primera;
        int creditos_segunda;
        int creditos_tercera;


         System.out.println ("Ingrese la   nota de la materia matematicas:  ");
         primera_nota=teclado.nextDouble();
          System.out.println ("Ingrese el numero de creditos que vale la materia de Matematicas:  ");
         creditos_primera=teclado.nextInt();
          System.out.println ("Ingrese la   nota de la materia Sociales:  ");
         segunda_nota=teclado.nextDouble();
          System.out.println ("Ingrese el numero de creditos que vale la materia de Sociales: ");
         creditos_segunda=teclado.nextInt();
         System.out.println ("Ingrese la   nota de la materia Ingles:  ");
         tercera_nota=teclado.nextDouble();
         System.out.println ("Ingrese el numero de creditos que vale la materia de Ingles: ");
         creditos_tercera=teclado.nextInt();
         promedio= ((primera_nota*creditos_primera)+(segunda_nota * creditos_segunda)+( tercera_nota * creditos_tercera ))/(creditos_primera + creditos_segunda + creditos_tercera );
          System.out.println("El promedio ponderado es :"+promedio);
    }
}