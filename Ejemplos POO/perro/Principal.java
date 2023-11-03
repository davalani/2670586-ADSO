public class Principal {

public static void main(String[] args){
    // Clases: Definen nuevos tipos de datos , una clase es una plantilla que se usará para crear Objetos/ Variables. archivos con extension .JAVA
    //Atributos: Datos propios de la clase definida o una caracteristicas de la clase.
    //Los atributos son variables globales
    //Metodos: las acciones que puede realizar un objeto perteneciente a la clase. Se representan como funciones.

    Perro perro_01 = new Perro("Toby", "Maria", 108,"Boxer",30.5, 40);
    Perro perro_02 = new Perro("Samantha", "Oscar", 2,"Weimaraner",4.5, 95);


    /*perro_01.nombre = "matias";
   
   /* perro_01.setNombre("Pecas");
    perro_01.setPropietario("Miguel Alzate");

    System.out.println("El nombre del Perro 01 es:" + perro_01.getNombre());
    System.out.println("El nombre del Perro 02 es:" + perro_02.getNombre());*/
    perro_01.comer(800);
    perro_01.imprimirDetalle();

    //perro_02.imprimirDetalle();//




}

}