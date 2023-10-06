public class ejercicio11 {

  public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

  public static void main(String[] args) {
    System.out.println("El factorial del número es:");
        System.out.println(factorial(5));
        System.out.println(factorial(4));
  }
}
