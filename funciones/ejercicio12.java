public class ejercicio12 {

  public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
  System.out.println(" Verificación del número primo:");
        System.out.println(esPrimo(7)); 
        System.out.println(esPrimo(4));
  }
}
