package progjava;

import java.util.Scanner;

/**
 * @author kaste
 */
public class conversiones {

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

        System.out.println("el resultado de la division es: " + ea / eb);
        
        double da;
        double db;
        
        System.out.println("Ingrese su el primer double:");
        da = input.nextInt();
        System.out.println("Ingrese el segundo double:");
        db = input.nextInt();

        System.out.println("el resultado de la division es: " + da / db);
        
    }
    
}