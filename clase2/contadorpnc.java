package clase2;

import java.util.Scanner;

/**
 * @author kaste
 */
public class contadorpnc {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int nro;
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 1; i<=10; i++){
            System.out.println("Ingrese un entero:");
            nro = input.nextInt();
            
            if (nro == 0) {
                ceros += 1;
            } else if (nro > 0) {
                positivos += 1;
            } else {
                negativos += 1;
            }
        }
        
        System.out.println("Los resultados son:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
    }
}