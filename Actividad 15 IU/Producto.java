public class Producto {

  private String id;
  private String nombre;
  private int precio;

  public Producto(String id, String nombre, int precio) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPrecio() {
    return this.precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }
}
