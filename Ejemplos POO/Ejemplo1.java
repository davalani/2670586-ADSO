public class Ejemplo1 {

  public static void main(String[] args) {
    int listado[] = new int[100];
    imprimirArreglo(listado);
    System.out.println("                                           ");
    listado = llenarArreglo(listado);
    imprimirArreglo(listado);
    /* System.out.println("----PROBANDO FUNCIONES ---- ");
    // System.out.println("Suma = " + sumar(5, 3));
    !*System.out.println("Suma = " + sumar(3, 2));
    System.out.println("Suma = " + sumar(-3, 20));
    System.out.println("Suma = " + sumar(100, -50));

    System.out.println("----PROBANDO FUNCIONES ---- ");
    System.out.println("Dividir = " + dividir(5, 3));
    System.out.println("Dividir = " + dividir(3, 2));
    System.out.println("Dividir = " + dividir(-3, 20));
    System.out.println("Dividir = " + dividir(100, -50));

    int juanito = sumar(4, 4);
    System.out.println("Juanito = " + juanito);

    saludar();

    if (sumar(-5, 12) >= 0) {
      System.out.println("El resultado es positivo");
    } else {
      System.out.println("El resultado no es positivo");
    }
    saludarEnBucle(10);

    imprimirTabla(5, 10);*/
  }

  public static int sumar(int a, int b) {
    int resultado = (a + b);
    return resultado;
  }

  public static float dividir(float a, float b) {
    float resultado = (a / b);
    return resultado;
  }

  public static void saludar() {
    System.out.println("+---------------------------------------+");
    System.out.println("+              HOLA MUNDO               +");
    System.out.println("+---------------------------------------+");
  }

  public static void saludarEnBucle(int cantidad) {
    for (int i = 0; i < cantidad; i++) {
      System.out.println("+---------------------------------------+");
      System.out.println("+              HOLA MUNDO " + i + "             +");
      System.out.println("+---------------------------------------+");
    }
  }

  public static void imprimirTabla(int tabla, int multiplo) {
    for (int i = 0; i <= multiplo; i++) {
      int resultado = tabla * i;
      System.out.println(tabla + " x " + i + " = " + resultado);
    }
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("[" + arreglo[i] + "]");
    }
  }

  public static int[] llenarArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      int aleatorio = (int) (Math.random() * 1000);
      arreglo[i] = aleatorio;
    }
    return arreglo;
  }

  public static String[] restablecerArreglo(String[] arreglo) {
    arreglo[i] = ninguno;
  }
  return arreglo;
}

public static void imprimirArreglotexto( String[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("[" + arreglo[i] + "]");
    }
  }
