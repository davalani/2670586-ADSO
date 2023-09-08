public class Principaal2{
    public static void main(String [] args){
        Persona arreglo[] = new Persona [100];
        arreglo[0] = new Persona(1088340376, "Oscar", "Loaiza", 85, 185, 300.5);
        arreglo[1] = new Persona(904581112, "karem", "villegas", 25, 155, 60.8);
        arreglo[2] = new Persona(10889611, "Maribel", "Obando", 26, 160, 56.2);
        arreglo[3] = new Persona(1001026589, "Sergio", "Martinez", 23, 187, 104.2);
        arreglo[4] = new Persona(52820958, "Daliana", "Osorio", 41, 165, 65.4);
        for (int i=0; i < arreglo.length; i++){
            if (arreglo[i] != null){
               System.out.println("Persona" +i+ ":" +arreglo[i].getNombres() );
            }
            
        }
    }
}