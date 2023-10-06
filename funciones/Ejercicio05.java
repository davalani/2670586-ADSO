public class ejercicio05 {

 public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

  public static void main(String[] args) {
    System.out.println("potencia de dos números:");
    System.out.println(potencia(5, 3));
    System.out.println(potencia(-2, 7));
    System.out.println(potencia(20, 40));
    System.out.println(potencia(20, 10));
    System.out.println(potencia(70, 4));
  }
}
