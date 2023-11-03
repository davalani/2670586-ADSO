import java.util.Scanner;

public class Curso {
    private int codigo;
    private String nombre;
    private String areaConocimiento;
    private int duracionHoras;
    private String[] listaTemas = new String[15];
    private int cantidadTemas = 0;

    // Constructor
    public Curso(int codigo, String nombre, String areaConocimiento, int duracionHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.duracionHoras = duracionHoras;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void imprimirDetalleCurso() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Área de conocimiento: " + areaConocimiento);
        System.out.println("Duración en horas: " + duracionHoras);
        System.out.println("Temas:");
        for (int i = 0; i < cantidadTemas; i++) {
            System.out.println("- " + listaTemas[i]);
        }
    }

    public void editarInformacionCurso(String nombre, String area, int duracion) {
        this.nombre = nombre;
        this.areaConocimiento = area;
        this.duracionHoras = duracion;
    }

    public void agregarTema(String tema) {
        if (cantidadTemas < 15) {
            listaTemas[cantidadTemas] = tema;
            cantidadTemas++;
        } else {
            System.out.println("No se pueden agregar más temas, máximo alcanzado.");
        }
    }
}

