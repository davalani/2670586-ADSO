import java.util.Scanner;
public class Ejercicio12{


    public static void main(String[]args){
        Scanner sistema = new Scanner(System.in);
        int precio;
        double precioFinal;
        float descuento;

        System.out.print("Ingrese el precio del articulo: ");
        precio = sistema.nextInt();

        System.out.print("Ingrese el descuento del articulo: ");
        descuento = sistema.nextFloat();

        if (descuento < 0 || descuento > 100){
            System.out.print("El descuento no es valido, ingreselo correctamente entre 0 y 100: ");
            descuento = sistema.nextInt();

            descuento= descuento/100;

            precioFinal = precio-(precio * descuento);
            System.out.print("Precio Final: " + precioFinal);
            
        }else{

            descuento= descuento/100;
            precioFinal = precio-(precio * descuento);
            System.out.print("Precio Final: " + precioFinal);
        }

    }
}