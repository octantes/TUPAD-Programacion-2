package clase8;

import java.util.Scanner;

public class ConversionNumero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("escribi un numero: ");
        String entrada = scanner.nextLine();

        try {
            
            int numero = Integer.parseInt(entrada);
            System.out.println("el numero ingresado es: " + numero);
            
        } catch (NumberFormatException e) { System.err.println("error: el texto " + entrada + " no se puede convertir a entero");
        } finally { scanner.close(); }
        
    }
    
}