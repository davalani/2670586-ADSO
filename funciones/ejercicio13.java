import java.util.Arrays;

public class ejercicio13 {

  public static void ordenarArreglo(int[] arreglo) {
    Arrays.sort(arreglo);
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(" Impresión del arreglo:");

    int[] arreglo1 = { 5, 2, 8, 1, 9 };
    imprimirArreglo(arreglo1);
    ordenarArreglo(arreglo1);
    System.out.println(Arrays.toString(arreglo1));
  }
}
