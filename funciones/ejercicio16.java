public class ejercicio16 {

 public static int contarDigitos(int numero) {
        return Integer.toString(numero).length();
    }
  public static void main(String[] args) {
   System.out.println("Los dígitos que hay son:");
        System.out.println(contarDigitos(12345));
        System.out.println(contarDigitos(0)); 
        System.out.println(contarDigitos(15)); 
        System.out.println(contarDigitos(1645)); 
  }
}
