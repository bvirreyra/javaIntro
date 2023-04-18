/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;
import java.util.Scanner;
/**
 *
 * @author yo
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();
        if (num1>25 &&num2>25){
            System.out.println("Ambos numeros son mayores que 25");
        }else if (num1>25){
          System.out.println("El numero uno es mayor que 25");   
        } else if (num2>25){
            System.out.println("El numero dos es mayor que 25");
        }else {
            System.out.println("Ninguno de los numeros es mayor que 25");
        }
                
    }
    
}
