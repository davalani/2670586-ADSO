import java.util.Scanner;
public class Ejercicio08{
	public static void main(String[] args) {
		
       Scanner teclado= new Scanner (System.in);
       System.out.println ("ingrese un numero maximo de 6 digitos:");
       int numero = teclado.nextInt();
       int contmod;
       int contdiv;
       int cont=1;
       int digito;


        if ( numero / 100000<=9 && numero / 100000>0 ){
          contmod=1000000;
          contdiv=100000;
            
            do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=6 );
		 }
          

            if ( numero / 10000<=9 &&   numero / 10000 >0 ){
               contmod=100000;
               contdiv=10000;
            
             do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=5);
		 }

          if ( numero / 1000<=9 &&   numero / 1000 >0 ){
               contmod=10000;
               contdiv=1000;
            
             do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=4);
		 }


          if ( numero / 100<=9 &&   numero / 100 >0 ){
               contmod=1000;
               contdiv=100;
            
             do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=3);
		 }

          if ( numero / 10<=9 &&   numero / 10 >0 ){
               contmod=100;
               contdiv=10;
            
             do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=2);
		 }
            
            if ( numero / 1<=9 ){
               contmod=10;
               contdiv=1;
            
             do{
			 digito=(numero % contmod)/contdiv;
             System.out.println ( "El digito " +cont +" es: "+digito );
             contmod=contmod/10;
             contdiv=contdiv/10;
             cont=cont+1;
		    }while( cont<=1);
		 }

   }
}
