import java.util.Scanner;
public class Principal {

  public static void main(String[] args) {
    Scanner entrada_numero = new Scanner(System.in);
    Scanner entrada_texto = new Scanner(System.in);
    Curso[] cursos = new Curso[100];
    int cantidadCursos = 0;

    while (true) {
      System.out.println("+--------------------------------------------+");
      System.out.println("|                             MENU DE CURSOS |");
      System.out.println("+--------------------------------------------+");
      System.out.println("|                               Memoria: 100 |");
      System.out.println("| 1. Crear curso.                            |");
      System.out.println("| 2. Listar todos los cursos.                |");
      System.out.println("| 3. Ver detalle de curso.                   |");
      System.out.println("| 4. Editar informacion de un curso.         |");
      System.out.println("| 5. Agregar tema a curso.                   |");
      System.out.println("| 6. Eliminar curso.                         |");
      System.out.println("| 7. Salir.                                  |");
      System.out.println("|                                            |");
      System.out.println("+--------------------------------------------+");

      System.out.print("Ingrese una opción: ");
      int opcion = entrada_numero.nextInt();

      switch (opcion) {
        case 1:
          if (cantidadCursos < 100) {
            System.out.print("Ingrese el código: ");
            int codigo = entrada_numero.nextInt();
            System.out.print("Ingrese el nombre: ");
            String nombre = entrada_texto.nextLine();
            System.out.print("Ingrese el área de conocimiento: ");
            String area = entrada_texto.nextLine();
            System.out.print("Ingrese la duración en horas: ");
            int duracion = entrada_numero.nextInt();

            boolean codigoRepetido = false;
            for (int i = 0; i < cantidadCursos; i++) {
              if (cursos[i].getCodigo() == codigo) {
                codigoRepetido = true;
                break;
              }
            }

            if (!codigoRepetido) {
              Curso nuevoCurso = new Curso(codigo, nombre, area, duracion);
              cursos[cantidadCursos] = nuevoCurso;
              cantidadCursos++;
              System.out.println("Curso creado con éxito.");
            } else {
              System.out.println("Error: El código ya existe.");
            }
          } else {
            System.out.println(
              "Error: Memoria llena, no se pueden agregar más cursos."
            );
          }
          break;
        case 2:
          System.out.println("Listado de todos los cursos:");
          for (int i = 0; i < cantidadCursos; i++) {
            System.out.println(
              cursos[i].getCodigo() +
              " - " +
              cursos[i].getNombre() +
              " - " +
              cursos[i].getDuracionHoras() +
              " hrs"
            );
          }
          break;
        case 3:
          System.out.print("Ingrese el código del curso: ");
          int codigoCurso = entrada_numero.nextInt();
          boolean encontrado = false;
          for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i].getCodigo() == codigoCurso) {
              cursos[i].imprimirDetalleCurso();
              encontrado = true;
              break;
            }
          }
          if (!encontrado) {
            System.out.println("Error: Curso no encontrado.");
          }
          break;
        case 4:
          System.out.print("Ingrese el código del curso a editar: ");
          int codigoEditar = entrada_numero.nextInt();
          encontrado = false;
          for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i].getCodigo() == codigoEditar) {
              System.out.print("Ingrese el nuevo nombre: ");
              String nuevoNombre = entrada_texto.nextLine();
              System.out.print("Ingrese el nuevo área de conocimiento: ");
              String nuevoArea = entrada_texto.nextLine();
              System.out.print("Ingrese la nueva duración en horas: ");
              int nuevaDuracion = entrada_numero.nextInt();
              cursos[i].editarInformacionCurso(
                  nuevoNombre,
                  nuevoArea,
                  nuevaDuracion
                );
              System.out.println("Curso editado con éxito.");
              encontrado = true;
              break;
            }
          }
          if (!encontrado) {
            System.out.println("Error: Curso no encontrado.");
          }
          break;
        case 5:
          System.out.print(
            "Ingrese el código del curso al que desea agregar un tema: "
          );
          int codigoAgregarTema = entrada_numero.nextInt();
          encontrado = false;
          for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i].getCodigo() == codigoAgregarTema) {
              System.out.print("Ingrese el tema a agregar: ");
              String tema = entrada_texto.nextLine();
              cursos[i].agregarTema(tema);
              System.out.println("Tema agregado con éxito.");
              encontrado = true;
              break;
            }
          }
          if (!encontrado) {
            System.out.println("Error: Curso no encontrado.");
          }
          break;
        case 6:
          System.out.print("Ingrese el código del curso a eliminar: ");
          int codigoEliminar = entrada_numero.nextInt();
          int indiceEliminar = -1;
          encontrado = false;
          for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i].getCodigo() == codigoEliminar) {
              indiceEliminar = i;
              encontrado = true;
              break;
            }
          }
          if (encontrado) {
            for (int i = indiceEliminar; i < cantidadCursos - 1; i++) {
              cursos[i] = cursos[i + 1];
            }
            cantidadCursos--;
            System.out.println("Curso eliminado con éxito.");
          } else {
            System.out.println("Error: Curso no encontrado.");
          }
          break;
        case 7:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida, por favor intente de nuevo.");
      }
    }
  }
}
