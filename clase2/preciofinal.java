package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class preciofinal {

    static double precioBase;
    static double precioFinal;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        
        System.out.println("Ingrese el porcentaje de impuesto: ");
        double pImpuesto = input.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double pDescuento = input.nextDouble();
        
        precioFinal = calcularPrecioFinal(pImpuesto, pDescuento);
        System.out.println("El precio final es: " + precioFinal);
    }
    
    static double calcularPrecioFinal(double impuesto, double descuento) {
            
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
            
    }
}