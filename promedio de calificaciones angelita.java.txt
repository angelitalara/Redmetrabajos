
package calificaciones;
import java.util.Scanner;

public class Calificaciones {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, q, a,i,f, suma, promedio ; 
        String nom;
 
System.out.println ("ingrese su nombre") ;
nom =  entrada.nextLine() ; 
System.out.println ("Ingrese la calificacion de calculo") ; 
c = entrada.nextInt() ; 
System.out.println ("Ingrese la calificacion de quimica") ; 
q = entrada.nextInt() ; 
System.out.println ("Ingrese la calificacion de algebra") ; 
a = entrada.nextInt() ; 
System.out.println ("Ingrese la calificacion de ingles") ; 
i = entrada.nextInt() ;
System.out.println ("Ingrese la calificacion de fisica") ; 
f = entrada.nextInt() ;
suma = (c+q+a+i+f) ; 
promedio = (suma/5) ; 
if (promedio > 5) { 
System.out.println ("El estudiante "+nom+ " aprovo con un promedio de: " +promedio ) ; 
} 
else { 
System.out.println ("El estudiante "+nom+ " No aprovo, el promedio es de: " +promedio ) ; 
} 
    }
    
}
