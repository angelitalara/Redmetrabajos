package examen;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int n;
        String res=new String();
        System.out.println(" ingrese un  numero");
       n=leer.nextInt();
        for(int i=1;i<=n;i++){
            res=i+res;
            System.out.println(res);
        
        }
        
        }
    
        }