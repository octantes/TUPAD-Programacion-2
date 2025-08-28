package clase3;

import java.util.Scanner;

public class registroMascotas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // instanciamos la clase Mascota
        Mascota mascota_uno = new Mascota();
        
        // le proporcionamos valores a sus atributos
        mascota_uno.nombre       =   "Cofi";
        mascota_uno.especie      =   "Gato";
        mascota_uno.edad         =   7;
        
        // llamamos a los metodos desde un switch
        
        System.out.println("Desea cambiar la edad o mostrar la informacion? "
                + "(Mostrar/Cambiar)");
        String modificar = input.nextLine().toUpperCase();
        
        switch (modificar) {
            case "CAMBIAR" -> {
                System.out.println("Ingrese la cantidad de años a sumar");
                double anios = input.nextInt();
                mascota_uno.cumplirAnios(anios);
                input.nextLine();
            }
            case "MOSTRAR" -> mascota_uno.mostrarInfo();
            default -> {
                System.out.println("La edad no fue modificada");
                mascota_uno.mostrarInfo();
                return;
            }
        }
        
    }
}