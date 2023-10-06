import java.util.Random;
public class ejercicio07 {

  public static void llenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random ()*1000);; 
        }
    }

      public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

         

    }

  public static void main(String[] args) {
    System.out.println(" El arreglo completo es:");
        int[] arreglo1 = new int[5];
        llenarArreglo(arreglo1);
        imprimirArreglo(arreglo1);

        int[] arreglo2 = new int[10];
        llenarArreglo(arreglo2);
        imprimirArreglo(arreglo2);

        int[] arreglo3 = new int[15];
        llenarArreglo(arreglo3);
        imprimirArreglo(arreglo3);

        int[] arreglo4 = new int[20];
        llenarArreglo(arreglo4);
        imprimirArreglo(arreglo4);

         int[] arreglo5 = new int[25];
        llenarArreglo(arreglo5);
        imprimirArreglo(arreglo5);
  }
}
