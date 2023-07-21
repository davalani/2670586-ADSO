import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("                         ");

        System.out.println("|------------- Bienvenido ------------|");
        System.out.println("|     1.  Docente                     |");
        System.out.println("|     2.  Estudiante                  |");
        System.out.println("|     3.  Salir                       |");
        System.out.println("|-------------------------------------|");
        System.out.println("                                       ");
        System.out.println("Digite la opcion deseada:");
        int option = teclado.nextInt();

        while (option != 3) {
            if (option < 1 || option > 3) {
                System.out.println("                         ");
                System.out.println("Escoja una de las opciones correctas");
                System.out.println("                         ");
            } else {
                if (option == 1) {
                    System.out.print(" Ingrese el numero de materias: ");
                    System.out.println("                         ");
                    int numero_materias = teclado.nextInt();
                    float suma_creditos = 0;
                    float nota_por_credito = 0;
                    float suma_nota_creditos = 0;

                    for (int cont = 1; cont <= numero_materias; cont++) {
                        System.out.print("Nota Materia " + cont + " = ");
                        System.out.println("                         ");
                        float nota = teclado.nextFloat();

                        System.out.print("Credito Materia " + cont + " = ");
                        System.out.println("                         ");

                        float credito = teclado.nextFloat();

                        nota_por_credito = nota * credito;
                        suma_nota_creditos = suma_nota_creditos + nota_por_credito;
                        suma_creditos = suma_creditos + credito;
                    }

                    float promedio = suma_nota_creditos / suma_creditos;
                    System.out.println("El promedio ponderado es: " + promedio);
                    System.out.println("                         ");

                } else {
                    if (option == 2) {
                        System.out.print("-> Ingrese el numero de notas que va a ingresar ");
                        System.out.println("                         ");
                        int numero_notas = teclado.nextInt();

                        int cont = 1;
                        float suma_notas = 0;

                        while (cont <= numero_notas) {
                            System.out.print("Nota " + cont + " = ");
                            System.out.println("                         ");
                            float nota = teclado.nextFloat();
                            cont = cont + 1;
                            suma_notas = suma_notas + nota;
                        }

                        float promedio = (suma_notas) / numero_notas;
                        System.out.println("El promedio es: " + promedio);
                        System.out.println("                         ");
                    }
                }
            }
            System.out.println("                         ");
            System.out.println("|------------- Bienvenido ------------|");
            System.out.println("|     1.  Docente                     |");
            System.out.println("|     2.  Estudiante                  |");
            System.out.println("|     3.  Salir                       |");
            System.out.println("|-------------------------------------|");
            System.out.println("                                       ");
            System.out.println("Digite la opcion deseada:");
            option = teclado.nextInt();

        }
        if (option == 3) {
            System.out.println("                         ");
            System.out.println("Muchas gracias por utilizar el programa");
            System.out.println("                         ");
        }
    }

}
