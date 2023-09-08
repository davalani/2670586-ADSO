public class Principal {

  public static void main(String[] args) {
    cajero cajero01 = new cajero(
      300000000,
      10000000,
      100,
      50,
      20,
      70,
      "banco Popular",
      "admin2023",
      "admin123"
    );
    cajero01.imprimirDetalle();

    cajero cajero02 = new cajero(
      150000000,
      "Davivienda",
      "admin2023",
      "admin123"
    );
    cajero02.imprimirDetalle();
    cajero02.abastecerCajero (1000,1000,500,500);
  
}
}
