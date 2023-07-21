import java.util.Scanner;

public class    Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100; // Convertir a decimal

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cuotas = scanner.nextInt();

        double saldoDeuda = valorTotal;
        double cuota;
        double interesCuota;
        double abonoCapital;

        System.out.println("\nDetalle de las cuotas:");
        System.out.println("---------------------");
        for (int cuotaNum = 1; cuotaNum <= cuotas; cuotaNum++) {
            // Cálculos de la cuota
            interesCuota = saldoDeuda * tasaInteres;
            cuota = saldoDeuda * (tasaInteres / (1 - Math.pow(1 + tasaInteres, -cuotas)));
            abonoCapital = cuota - interesCuota;
            saldoDeuda -= abonoCapital;

            // Mostrar detalles de la cuota
            System.out.println("Cuota " + cuotaNum + ":");
            System.out.println("Valor de la cuota: " + cuota);
            System.out.println("Valor del interés: " + interesCuota);
            System.out.println("Abono a capital: " + abonoCapital);
            System.out.println("Deuda total: " + saldoDeuda);
            System.out.println("---------------------");
        }
    }
}
