import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {

        Random random = new Random();
        int dia = random.nextInt(30)+1;
        int mes = random.nextInt(12)+1;
        int anio = random.nextInt(3000)+1;

       
             if (mes == 2) {
            if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
                dia = random.nextInt(29)+1;
            } else{
                dia = random.nextInt(28)+1;
            }
            
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes==8 || mes==10 || mes==12) {
            dia = random.nextInt(31)+1 ; 
        }

        if (dia < 10 && mes < 10){
         System.out.println("Fecha generada: " +"0" + dia + "/" +"0" + mes + "/" + anio);
        }
        if (dia < 10 && mes > 10){
         System.out.println("Fecha generada: " +"0" + dia + "/"  + mes + "/" + anio);
        }
        if (dia > 10 && mes < 10){
         System.out.println("Fecha generada: " + dia + "/" +"0" + mes + "/" + anio);
        }else  {
            if (dia > 10 && mes > 10){
         System.out.println("Fecha generada: "  + dia + "/" + mes + "/" + anio);
        }
        }

        }
        }
        


  
