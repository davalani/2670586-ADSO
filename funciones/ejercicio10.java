public class ejercicio10 {

  public static double promedioArreglo(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
      suma += arreglo[i];
    }
    return (double) suma / arreglo.length;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(" Impresión del arreglo 2:");
    int[] arreglo2 = { 65, 17, 24, 13, 705, 902, 21, 689, 52 };
    imprimirArreglo(arreglo2);
    System.out.println("Promedio del arreglo:");
    System.out.println(promedioArreglo(arreglo2));
  }
}
