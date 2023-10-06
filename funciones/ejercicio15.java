public class ejercicio15 {

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    int fib = 1;
    int prevFib = 1;
    for (int i = 2; i < n; i++) {
      int temp = fib;
      fib += prevFib;
      prevFib = temp;
    }
    return fib;
  }

  public static void main(String[] args) {
    System.out.println("Fibonacci es:");
    System.out.println(fibonacci(6)); 
    System.out.println(fibonacci(7));
    System.out.println(fibonacci(8));
  }
}
