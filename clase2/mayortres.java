package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class mayortres {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int na;
        int nb;
        int nc;
        
        System.out.println("Ingrese tres enteros:");
        na = input.nextInt();
        nb = input.nextInt();
        nc = input.nextInt();
        
        if (na > nb && na > nc) {
            System.out.println("El numero " + na + " es el mas grande");
        } else if (nb > na && nb > nc) {
            System.out.println("El numero " + nb + " es el mas grande");
        } else if (nc > na && nc > nb) {
            System.out.println("El numero " + nc + " es el mas grande");
        } else {
            System.out.println("Hay numeros empatados!");
        }

    }
    
}