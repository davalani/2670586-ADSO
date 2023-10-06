public class ejercicio21 {

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static void main(String[] args) {
    System.out.println(" Los  Celsius  convertidos a Fahrenheit son:");
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(100));
  }
}
