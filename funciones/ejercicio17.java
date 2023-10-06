public class ejercicio17 {

  public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

  public static void main(String[] args) {
     System.out.println(" La Suma de los dígitos es:");
        System.out.println(sumaDigitos(12345));
        System.out.println(sumaDigitos(987)); 
  }
}
