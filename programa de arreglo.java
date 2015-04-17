package ejemploarreglo;
import java.util.Scanner;

public class EjemploArreglo {

    
    public static void main(String[] args) {
        String nombre;
        String[] materias=new String[3];
        Scanner leer=new Scanner(System.in);
        System.out.println(" escribe tu nombre:");
        nombre=leer.next();
        for(int i=0;i<3;i++){
            System.out.println(" escribe tu materia"+i+":");
            materias[i]=leer.next();
        }
        System.out.println(" nombre del alumno: "+nombre);
        System.out.println(" ::materias::");
        System.out.print(materias[0]+"\n"+materias[1]+"\n"+materias[2]);
    
    
        
        
        
        
        /*
       String nombre;
       String mat1,mat2,mat3;
       Scanner leer =new Scanner(System.in);
        System.out.println(" escribe nombre ");
        nombre = leer.next();
        System.out.println(" escribe  tu materia 1:");
        mat1 =leer.next();
        System.out.println(" escribe materia 2:");
        mat2 =leer.next();
        System.out.println(" escribe materia 3:");
        mat3 =leer.next();
        System.out.println(" el nombre del alumno es "+nombre);
        System.out.println(" sus materias son "+mat1+""+mat2+""+mat3);
        */
    }
}
