package progjava;

import java.util.Scanner;

/**
 * @author kaste
 */
public class scanner {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre:");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad:");
        edad = input.nextInt();
        
        System.out.println("soy " + nombre + " y tengo " + edad + "años.");
    }
    
}