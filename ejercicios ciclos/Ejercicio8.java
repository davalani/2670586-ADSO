import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero maximo de 6 digitos:");
        int numero = teclado.nextInt();
        int contmod = 1;
        int contdiv = 1;
        int cont = 1;
        int digito;

        int maxDiv = 100000;
        while (maxDiv != 0) {
            if (numero / maxDiv >= 1) {
                contmod = maxDiv * 10;
                contdiv = maxDiv;
                maxDiv = 0;
            } else {
                maxDiv = maxDiv / 10;
            }
        }

        do {
            digito = (numero % contmod) / contdiv;
            System.out.println("El digito " + cont + " es: " + digito);
            contmod = contmod / 10;
            contdiv = contdiv / 10;
            cont = cont + 1;
        } while (contdiv > 0);

    }
}