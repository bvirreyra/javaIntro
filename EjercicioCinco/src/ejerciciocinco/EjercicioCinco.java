/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;
import java.util.Scanner;

/**
 *
 * @author yo
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese un valor booleano");
        boolean a =leer.nextBoolean();
        System.out.println("Ingrese un valor real");
        double b=leer.nextDouble();
        System.out.println("Ingrese un caracter");
        String add= leer.next();
        System.out.println("las variables ingresadas son: " + add);
    }
    
}
