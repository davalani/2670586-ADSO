import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número N: ");
        int numero = teclado.nextInt();

        int contmod = 1;
        int contdiv = 1;
        int cont = 1;
        int digito;
        int suma_digitos = 0;
        int suma_digitos2 = 0;

        int maxDiv = 100000;
        System.out.println("Raiz digital: ");
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
            contmod = contmod / 10;
            contdiv = contdiv / 10;
            cont = cont + 1;
            System.out.print(+digito);

            if (contmod > 1) {
                System.out.print(" + ");
            }
            suma_digitos = suma_digitos + digito;

        } while (contdiv > 0);

        System.out.println(" = " + suma_digitos);

        contmod = 1;
        contdiv = 1;
        cont = 1;
        maxDiv = 100000;

        while (maxDiv != 0) {
            if (suma_digitos / maxDiv >= 1) {
                contmod = maxDiv * 10;
                contdiv = maxDiv;
                maxDiv = 0;
            } else {
                maxDiv = maxDiv / 10;
            }
        }

        do {

            digito = (suma_digitos % contmod) / contdiv;
            contmod = contmod / 10;
            contdiv = contdiv / 10;
            cont = cont + 1;
            System.out.print(+digito);

            if (contmod > 1) {
                System.out.print(" + ");
            }
            suma_digitos2 = suma_digitos2 + digito;

        } while (contdiv > 0);
        System.out.println(" = " + suma_digitos2);
        System.out.println(" La raiz digital de " + numero + " es: " + suma_digitos2);

    }
}
