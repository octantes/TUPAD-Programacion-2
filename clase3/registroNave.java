package clase3;

import java.util.Scanner;

public class registroNave {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // instanciamos la clase Nave pasando sus atributos al constructor
        
        Nave nave_uno = new Nave();
        nave_uno.nombre = "Nabucodonosor";
        nave_uno.combustible = 50;
        
        nave_uno.despegar();
        nave_uno.avanzar(100);
        nave_uno.avanzar(200);
        nave_uno.recargarCombustible(50);
        nave_uno.avanzar(200);
        nave_uno.avanzar(100);
        nave_uno.recargarCombustible(500);
        nave_uno.mostrarEstado();
        

    }
}