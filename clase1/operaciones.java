package progjava;

import java.util.Scanner;

/**
 * @author kaste
 */
public class operaciones {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ea;
        int eb;
        
        System.out.println("Ingrese su el primer entero:");
        ea = input.nextInt();
        System.out.println("Ingrese el segundo entero:");
        eb = input.nextInt();
        
        
        
        System.out.println("el resultado de la suma es: " + (ea + eb));
        System.out.println("el resultado de la resta es: " + (ea - eb));
        System.out.println("el resultado de la multiplicacion es: " + ea * eb);
        System.out.println("el resultado de la division es: " + ea / eb);
    }
    
}