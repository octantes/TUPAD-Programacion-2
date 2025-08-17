package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class clasificacion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int edad;
        System.out.println("Ingrese su edad:");
        edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

    }
    
}