import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Scanner teclado_texto = new Scanner(System.in);

    int memoria_max = 100;
    int registros = 0;
    String[] arreglo = new String[memoria_max];
    System.out.println(
      "Memoria disponible: " + (memoria_max - registros) + " Registros."
    );
    System.out.println("1: Registrar cliente.");
    System.out.println("2: Ver lista de clientes.");
    System.out.println("3: Editar cliente.");
    System.out.println("4: Eliminar cliente.");
    System.out.println("5: Salir");

    System.out.print("Seleccione una opción: ");
    int op = teclado.nextInt();
    while (op < 5 && op >= 1) {
      if (op == 1) {
        if (registros < memoria_max) {
          System.out.print("Ingrese el nombre completo del cliente: ");
          String nombre = teclado_texto.nextLine();

          int cantidad_cliente = -1;
          for (int i = 0; i < registros; i++) {
            if (arreglo[i].equals(nombre)) {
              cantidad_cliente = i;
            }
          }

          if (cantidad_cliente == -1) {
            arreglo[registros] = nombre;
            registros++;
            System.out.println("Cliente registrado exitosamente.");
          } else {
            System.out.println("El cliente ya está registrado.");
          }
        } else {
          System.out.println("No se pueden agregar más registros.");
        }
      }

      if (op == 2) {
        System.out.println("Lista de clientes:");
        for (int i = 0; i < registros; i++) {
          System.out.println((i + 1) + ": " + arreglo[i]);
        }
      }

      if (op == 3) {
        System.out.print("Ingrese el nombre del cliente a editar: ");
        String editar = teclado_texto.nextLine();

        int editados = -1;
        for (int i = 0; i < registros; i++) {
          if (arreglo[i].equals(editar)) {
            editados = i;
          }
        }

        if (editados != -1) {
          System.out.print("Ingrese el nuevo nombre del cliente: ");
          String nuevo_nombre = teclado_texto.nextLine();
          arreglo[editados] = nuevo_nombre;
          System.out.println("Cliente editado exitosamente.");
        } else {
          System.out.println("Cliente no encontrado.");
        }
      }
      if (op == 4) {
        System.out.print("Ingrese el nombre del cliente a eliminar: ");
        String nombre_eliminado = teclado_texto.nextLine(); 
        int eliminados = -1;
        for (int i = 0; i < registros; i++) {
          if (arreglo[i].equals(nombre_eliminado)) {
            eliminados = i;
          }
        }

        if (eliminados != -1) {
          for (int i = eliminados; i < registros - 1; i++) {
            arreglo[i] = arreglo[i + 1];
          }
          arreglo[registros - 1] = null;
          registros--;
          System.out.println("Cliente eliminado exitosamente.");
        } else {
          System.out.println("Cliente no encontrado.");
        }
      }
       System.out.println(
        "Memoria disponible: " + (memoria_max - registros) + " Registros."
      );
      System.out.println("1: Registrar cliente.");
      System.out.println("2: Ver lista de clientes.");
      System.out.println("3: Editar cliente.");
      System.out.println("4: Eliminar cliente.");
      System.out.println("5: Salir");

      System.out.print("Seleccione una opción: ");
      op = teclado.nextInt();
      }
        
      
      if (op == 5){
         System.out.println(
        "¡Gracias por utilizar nuestro sistema! :)"
      );
      }
    }
  }

