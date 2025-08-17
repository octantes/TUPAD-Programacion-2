package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class enviototal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio base del producto: ");
        double precio = input.nextDouble();
        
        System.out.println("Ingrese el peso del paquete en kilos: ");
        double peso = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese la zona de envio (nacional/internacional)");
        String zona = input.nextLine();
        
        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);
        
        System.out.println("El costo de envio es: " + envio);
        System.out.println("El precio final es: " + total);
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    
    static double calcularTotalCompra(double precio, double envio) {
        return precio + envio;
    }
}