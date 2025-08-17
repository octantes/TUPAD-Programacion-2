package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class bisiestos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ano;
        
        System.out.println("Ingrese el año:");
        ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("El año " + ano + " es bisiesto");
        } else {
            System.out.println("El año " + ano + " no es bisiesto");
        }
    }
    
}