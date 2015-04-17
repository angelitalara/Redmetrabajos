package horastrabajadas;
import java.util.Scanner;
public class HorasTrabajadas {

  
    public static void main(String[] args) {//Empieza mi programa
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        /*Ingreso las variables para guardar la hora de entrada y de salida 
        que el usuario ingrese*/
        String HE,HS;
        System.out.println("Ingrese hora de entrada del trabajador");
        HE= dato.next();
        System.out.println("Ingrese hora de salida del trabjador");
        HS= dato.next();
        //UTLIZO METODOS
        String HorasEntrada= HE.substring(0,2);
        /*Substraigo la hora de entrada y la guardo en otra variable*/
        System.out.println(HorasEntrada);
        
        String HorasSalida= HS.substring(0,2);
        /*Substraigo la hora de salida y la guando en otra variable*/
        System.out.println(HorasSalida);
        System.out.println(HE + HS);
        
        /*Aqui  resto la hora de salida con la hora de entrada para que me 
        de las horas totales que el trabajador trabajò*/
        System.out.println(Integer.parseInt(HorasSalida) -
                Integer.parseInt(HorasEntrada));
        
        
        
        
        
    }//Fin de mi programa
    
}
