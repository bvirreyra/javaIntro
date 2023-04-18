/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce1;
import java.util.Scanner;
/**
 *
 * @author yo
 */
public class EjercicioOnce1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase terminada en punto");
        String frase =leer.nextLine();
        for (int i = 0; i < frase.length(); i++){
            char parteFrase = frase.charAt(i);
            switch (parteFrase){
            case 'a':
                parteFrase='@';
                break;
            case 'e':
                parteFrase='#';
                break;
            case 'i':
                parteFrase='$';
                break;
            case 'o':
                 parteFrase='%';
                break;
            case 'u':
                parteFrase='*';
                break;
        }
            System.out.print(parteFrase);
                
        }
        System.out.print("");
        default:
    }
    
}
