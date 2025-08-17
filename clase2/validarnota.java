package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class validarnota {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = input.nextInt();
        
        while (nota > 10 || nota < 0) {
            System.out.println("La nota no es valida, vuelva a ingresar una nota entre 0 y 10");
            nota = input.nextInt();
        }
        
        System.out.println("Nota " + nota + " guardada correctamente");
    }
}