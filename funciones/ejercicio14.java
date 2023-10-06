public class ejercicio14{

    public static boolean estaOrdenado(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i - 1] > arreglo[i]) {
                return false;
            }
        }
        return true;
    }

 

  public static void main(String[] args) {
    int[] arreglo2 = { 1, 2, 3, 4, 5 };
        System.out.println(estaOrdenado(arreglo2)); 
        int[] arreglo3 = { 5, 3, 1, 4, 2 };
        System.out.println(estaOrdenado(arreglo3));
  }
  }
