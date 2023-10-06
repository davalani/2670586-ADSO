import java.util.Random;
public class ejercicio25 {

   public static int numeroAleatorioEnRango(int minimo, int maximo) {
        Random rand = new Random();
        return rand.nextInt((maximo - minimo) + 1) + minimo;
    }

  public static void main(String[] args) {
    System.out.println("LEl numero aleatorio es:");
    System.out.println(numeroAleatorioEnRango(1, 10));
    System.out.println(numeroAleatorioEnRango(-5, 5));
  }
}
