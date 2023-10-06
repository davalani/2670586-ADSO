public class ejercicio24 {

  public static int[] contarParesImpares(int[] arreglo) {
    int contadorPares = 0;
    int contadorImpares = 0;
    for (int numero : arreglo) {
      if (numero % 2 == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }
    }
    return new int[] { contadorPares, contadorImpares };
  }

  public static void main(String[] args) {
    System.out.println(
      "los numeros imparea y pares son:"
    );
    int[] arreglo1 = { 2, 5, 8, 7, 12, 9 };
    int[] resultado1 = contarParesImpares(arreglo1);
    System.out.println("Pares: " + resultado1[0] + ", Impares: " + resultado1[1]); 
    int[] arreglo2 = { 1, 3, 5, 7 };
    int[] resultado2 = contarParesImpares(arreglo2);
    System.out.println("Pares: " + resultado2[0] + ", Impares: " + resultado2[1]); 
  }
}
