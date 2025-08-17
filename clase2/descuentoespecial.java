package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class descuentoespecial {
    
    static double descuento = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);

    }
    
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento aplicado al producto es: " + descuentoAplicado);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}