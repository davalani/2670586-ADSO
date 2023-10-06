public class ejercicio23 {

  public static double calcularInteresCompuesto(double capitalInicial, double tasaInteres, int periodo) {
        return capitalInicial * Math.pow(1 + tasaInteres, periodo);
    }

  public static void main(String[] args) {
    System.out.println(" el monto final del  interés compuesto es:");
    System.out.println(calcularInteresCompuesto(1000, 0.05, 3)); // Debería imprimir 1157.625
    System.out.println(calcularInteresCompuesto(5000, 0.03, 5));
  }
}
