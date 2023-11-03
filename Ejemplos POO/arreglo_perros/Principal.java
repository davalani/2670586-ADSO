import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner entrada_numero = new Scanner(System.in);
    Scanner entrada_texto = new Scanner(System.in);

    Perro[] listado = new Perro[20];

    listado[0] = new Perro("Toby", "Maria", 108, "Boxer", 30.5, 40);
    listado[1] = new Perro("Samantha", "Oscar", 2, "Weimaraner", 4.5, 95);
    listado[2] = new Perro("Tocky", "Daliana", 59, "yorcky terrier", 4.5, 85);
    listado[3] = new Perro("Silvana", "Valeria", 85, "Dalmata", 6, 60);
    listado[4] = new Perro("nala", "Laura", 20, "Golden", 3, 91);
    listado[5] = new Perro("maia", "Nicole", 100, "Lobo siveriano", 6.5, 65);
    listado[6] = new Perro("seuz", "Mia", 1, "Pastor Aleman", 6.5, 100);

    /* System.out.print("Ingrese nombre de su mascota: ");
        String nombre = entrada_texto.nextLine();

        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = entrada_texto.nextLine();

        System.out.print("Ingrese la edad de su perro (en meses): ");
        int edad = entrada_numero.nextInt();

        System.out.print("Ingrese la raza de su perro: ");
        String raza = entrada_texto.nextLine();

        System.out.print("Ingrese el peso de su mascota: ");
        double peso = entrada_numero.nextDouble();

        System.out.print("Ingrese nivel de energia en porcentaje de su mascota: ");
        int energia = entrada_numero.nextInt();

        listado[7] = new Perro(nombre, propietario, edad, raza,peso,energia);*/

    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        listado[i].imprimirDetalle();
      }
    }

    //perro mas pesado
    Perro mas_pesado = listado[0];
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        if (listado[i].getPeso() >= mas_pesado.getPeso()) {
          mas_pesado = listado[i];
        }
      }
    }
    if (mas_pesado != null) {
      System.out.println("Nombre mas pesado: " + mas_pesado.getNombre());
      System.out.println(
        "Propietario del mas pesado: " + mas_pesado.getPropietario()
      );
      System.out.println("Peso del mas pesado: " + mas_pesado.getPeso());
    }
  }
}
