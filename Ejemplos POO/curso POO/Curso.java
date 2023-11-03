public class Curso{

//atributos
int codigo;
String nombre;
String area_conocimiento;
int horas;
String temas [] = new String [];


}



    public Curso(int codigo, String nombre, String area_conocimiento, int horas, String temas[]) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area_conocimiento = area_conocimiento;
        this.horas = horas;
    }
    
    

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea_conocimiento() {
        return this.area_conocimiento;
    }

    public void setArea_conocimiento(String area_conocimiento) {
        this.area_conocimiento = area_conocimiento;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


