import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){

        Scanner sistema = new Scanner(System.in);
        int calculo;
        int año;
        int mes;
        int dia;
        int año_actual;
        int mes_actual;
        int dia_actual;

        System.out.println("Para saber si es mayor de edad");
        System.out.print("Ingrese su año completo de nacimiento: ");
        año = sistema.nextInt();
        System.out.print("Ingrese el numero del mes de nacimiento: ");
        mes = sistema.nextInt();
        System.out.print("Ingrese su dia de nacimiento: ");
        dia = sistema.nextInt();
        System.out.print("Ahora, ingrese el año actual : ");
        año_actual = sistema.nextInt();
        System.out.print("Ingrese el numero del mes actual: ");
        mes_actual = sistema.nextInt();
        System.out.print("Ingrese el numero del dia actual: ");
        dia_actual= sistema.nextInt();

        calculo = (año_actual-año);

     
        if (calculo >= 18  && mes_actual == mes){
            if (dia_actual >= dia){
                System.out.print("Usted es mayor de edad");
            }else{
                System.out.print("Usted es menor de edad");
            }
        }else if (calculo >= 18  && mes_actual > mes){
            System.out.print("Usted es mayor de edad");
        }else{
            System.out.print("Usted es menor de edad");
        }

    }
}