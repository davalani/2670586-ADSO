public class ejercicio09 {

  public static int minimoArreglo(int[] arreglo) {
    int min = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i] < min) {
        min = arreglo[i];
      }
    }
    return min;
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
    System.out.println(" Mínimo del arreglo:");
    System.out.println(minimoArreglo(arreglo2));
  }
}
