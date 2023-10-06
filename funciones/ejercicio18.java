public class ejercicio18 {

   public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

  public static void main(String[] args) {
  System.out.println(" El numero invertido es:");
        System.out.println(invertirNumero(12345)); 
        System.out.println(invertirNumero(23415)); 
  }
}
