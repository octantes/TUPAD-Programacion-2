package clase3;

import java.util.Scanner;

public class registroGallinas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // instanciamos la clase Gallina pasando sus atributos al constructor
        
        Gallina gallina_uno = new Gallina(1, 1.5, 253);
        Gallina gallina_dos = new Gallina(2, 2.5, 541);

        // llamamos a los metodos desde un switch
        System.out.println("Que gallina quiere modificar? 1/2");
        int opcion = input.nextInt();
        input.nextLine();
        
        Gallina instancia;
        if (opcion == 1){
            instancia = gallina_uno;
        } else {
            instancia = gallina_dos;
        }
        
        while (true) {
            System.out.println("Que quiere hacer? (EDAD/HUEVO/MOSTRAR/CAMBIAR)");
            String modificar = input.nextLine().toUpperCase();

            switch (modificar) {
                case "EDAD" -> {
                    System.out.println("Ingrese los años a sumar:");
                    instancia.envejecer(input.nextInt());
                    input.nextLine();
                }
                case "HUEVO" -> {
                    System.out.println("Ingrese los huevos a poner:");
                    instancia.ponerHuevo(input.nextInt());
                    input.nextLine();
                }
                case "MOSTRAR" -> instancia.mostrarEstado();
                case "CAMBIAR" -> {
                    System.out.println("Que gallina quiere modificar? 1/2");
                    opcion = input.nextInt();
                    input.nextLine();
                    if (opcion == 1){
                        instancia = gallina_uno;
                    } else {
                        instancia = gallina_dos;
                    }
                }
                default -> {
                    System.out.println("La gallina no fue modificada, saliendo");
                    instancia.mostrarEstado();
                    return;
                }
            }
        }
    }
}