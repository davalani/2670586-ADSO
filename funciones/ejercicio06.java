public class ejercicio06 {

  public static int maximo(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

  public static void main(String[] args) {
    System.out.println("maximo de dos números:");
    System.out.println(maximo(5, 3,9));
    System.out.println(maximo(-2, 7, -5));
    System.out.println(maximo(20, 40, 4));
    System.out.println(maximo(250, 4810,-256));
    System.out.println(maximo(780, 4740,14));
  }
}
