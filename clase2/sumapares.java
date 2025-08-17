package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class sumapares {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int nro;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero a sumar (0 para salir):");
            nro = input.nextInt();
            if (nro % 2 == 0) {
                suma += nro;
            }
        } while (nro != 0);
        
        System.out.println("La suma de los numeros es de " + suma);
    }
}