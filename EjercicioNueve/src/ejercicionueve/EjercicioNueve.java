/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;
import java.util.Scanner;
/**
 *
 * @author yo
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        int suma=0;
        int contador=0;
        do {
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if (num==0){
                
                suma=suma+num;
                System.out.println("se capturo el numero cero ");
                break;
            }else if (num>0){
                suma=suma+num;
                contador++;
                
            }
        }while (contador<20);
        System.out.println("La sumatoria de los numeros es "+suma);
           
            
            
        }
            
        
    
}
