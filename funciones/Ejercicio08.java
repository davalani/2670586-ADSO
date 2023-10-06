public class ejercicio08 {

  public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

         

    }
public static void main(String[] args) {
    System.out.println(" Impresión del arreglo 1:");
        int[] arreglo1 = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        imprimirArreglo(arreglo1);

        System.out.println(" Impresión del arreglo 2:");
        int[] arreglo2 = { 65, 17, 24, 13, 705, 902, 21, 689, 52 };
        imprimirArreglo(arreglo2);

        System.out.println(" Impresión del arreglo 3:");
        int[] arreglo3 = { 103, 781, 44, 120, 518, 9, 278, 86, 755 };
        imprimirArreglo(arreglo3);

        System.out.println(" Impresión del arreglo 4:");
        int[] arreglo4 = { 8503, 2361, 14, 185, 563, 908, 245, 566, 25 };
        imprimirArreglo(arreglo4);

        System.out.println(" Impresión del arreglo 5:");
        int[] arreglo5 = { 3, 451, 894, 151, 556, 998, 274, 696, 523 };
        imprimirArreglo(arreglo5);
  }

  
 
}
