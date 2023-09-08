public class cajero {

  int capacidadTotal;
  int cantAvailable;
  int cant_10;
  int cant_20;
  int cant_50;
  int cant_100;
  String nombreBanco;
  String[] transacciones;
  String usuarioAdmin;
  String claveAdmin;

  public cajero(
    int cantTotal,
    int cantAvailable,
    int cant_10,
    int cant_20,
    int cant_50,
    int cant_100,
    String nombreBanco,
    String usuarioAdmin,
    String claveAdmin
  ) {
    this.capacidadTotal = cantTotal;
    this.cantAvailable = cantAvailable;
    this.cant_10 = cant_10;
    this.cant_20 = cant_20;
    this.cant_50 = cant_50;
    this.cant_100 = cant_100;
    this.nombreBanco = nombreBanco;
    this.usuarioAdmin = usuarioAdmin;
    this.claveAdmin = claveAdmin;
    this.transacciones = new String[100];
  }

  public cajero(
    int cantTotal,
    String nombreBanco,
    String usuarioAdmin,
    String claveAdmin
  ) {
    this.capacidadTotal = cantTotal;
    this.nombreBanco = nombreBanco;
    this.usuarioAdmin = usuarioAdmin;
    this.claveAdmin = claveAdmin;
    this.cantAvailable = 0;
    this.cant_10 = 0;
    this.cant_20 = 0;
    this.cant_50 = 0;
    this.cant_100 = 0;
    this.transacciones = new String[100];
  }

  public void imprimirDetalle() {
    System.out.println("-----------------------------------------");
    System.out.println("capacidadTotal: " + capacidadTotal);
    System.out.println("cantAvailable: " + cantAvailable);
    System.out.println("cant_10: " + cant_10);
    System.out.println("cant_20: " + cant_20);
    System.out.println("cant_50: " + cant_50);
    System.out.println("cant_100: " + cant_100);
    System.out.println("nombreBanco: " + nombreBanco);
    System.out.println("usuarioAdmin: " + usuarioAdmin);
    System.out.println("claveAdmin: " + claveAdmin);
    System.out.println("Historial Transacciones: ");

    for (int i = 0; i < transacciones.length; i++) {
      if (transacciones[i] != null) {
        System.out.println("        =>" + transacciones[i]);
      }
    }

    System.out.println("-----------------------------------------");
  }

  public boolean abastecerCajero( int cant_10, int cant_20, int cant_50, int cant_100){

    int total = (cant_10*10000) + (cant_20*20000) + (cant_50 * 50000) + (cant_100*100000);
    if (total <= capacidadTotal) {
        cantAvailable = total;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;

        system.out.println("---- CAJERO RECARGADO----");
        return true;

    }else {
        system.out.println("---- ERROR EN RECARGA----");
        return false;
    }

    public void registrarTransaccion (String tipo, Sring numeroTarjeta, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+"-" + tipo + "-" +numeroTarjeta+ "-" +monto+"-" + estado;
        int indice = -1;

        for (int i =0; i< transacciones.length; i++){
            if (transacciones[i]==null){
                indice = i;
            }
        }

        if (indice != -1){
            transacciones [ indice] = texto;
        }else {
            
        }
    }

    
  
  }
}
