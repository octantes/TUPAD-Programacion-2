package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class descuentos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto:");
        int precio = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su categoría (A, B, C):");
        String categoria = input.nextLine().toUpperCase();

        double descuento;
        switch (categoria) {
            case "A" -> descuento = 0.10;
            case "B" -> descuento = 0.15;
            case "C" -> descuento = 0.20;
            default -> {
                System.out.println("Categoría inválida");
                return;
            }
        }

        double precioFinal = precio * (1 - descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
}