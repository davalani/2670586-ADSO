public class ejercicio04 {

  public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cuidado División por cero.");
            return 0;
        }
    }

  public static void main(String[] args) {
    System.out.println("division de dos números:");
    System.out.println(division(5, 3));
    System.out.println(division(-2, 7));
    System.out.println(division(20, 40));
    System.out.println(division(250, 4810));
    System.out.println(division(780, 4740));
  }
}
