package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class preciosrecursivos {
    
    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirPrecios(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        imprimirPrecios(precios, 0);
        
    }
    
    static void imprimirPrecios(double[] precios, int i) {
        if (i < precios.length) {
            System.out.println("Precio: $" + precios[i]);
            imprimirPrecios(precios, i + 1);
        }
    }
    
}