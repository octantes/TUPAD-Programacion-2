package clase8;

import java.util.Scanner;

public class DivisionSegura {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("escribi el primer numero: ");
            int primero = scanner.nextInt();
            System.out.print("escribi el segundo numero: ");
            int segundo = scanner.nextInt();

            int resultado = primero / segundo;
            
            System.out.println("el resultado es: " + resultado);

        } catch (ArithmeticException e) { System.err.println("error: no se puede dividir por cero");
        } catch (Exception e) { System.err.println("error: tenes que escribir enteros");
        } finally { scanner.close(); }
        
    }
    
}