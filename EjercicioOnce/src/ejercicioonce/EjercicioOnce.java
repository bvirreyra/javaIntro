/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;
import java.util.Scanner;
/**
 *
 * @author yo
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String palabra="palabra";
        String[] str=palabra.split("[a]");
        System.out.println(str.length);
    }
    
}
