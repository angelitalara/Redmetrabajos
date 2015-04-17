package programade6numeros;
import java.util.Scanner;

public class Programade6Numeros {


    public static void main(String[] args) {
        int[]nums = new int[6];
        String op = new String();
        int aux;
        Scanner dato = new Scanner(System.in);
        for(int i = 0, len = nums.length;i < len; i++) {
            System.out.println("Escriba el numero ["+i+"]:");
            nums[i] = dato.nextInt();
            
        }
        System.out.println("Que numero desea imprimir?");
        System.out.println("a)Mayor a Menor");
        System.out.println("b)Menor a Mayor");
        op = (dato.next()).toLowerCase();
        
        switch(op){
            case"a":
                //ordenando de mayor a Menor
                for(int j = 0;j < nums.length-1;j++){
                for(int i = 0;i <  nums.length-1;i++){
                    if(nums[i] < nums[i+1]){
                        aux = nums[i];
                        nums[i]= nums[i+1];
                        nums[i+1] = aux;
                        
                    }
                    
                }
                
                
        }
                for(int i = 0; i < nums.length;i++){
                    System.out.println(nums[i]);
                    
                }
        break;
                case"b":
                    //ordenar de Menor a amayor
                    
                        
                    
                    break;
            }
            
        }
   
}
