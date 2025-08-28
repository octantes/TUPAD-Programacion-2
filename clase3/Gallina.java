package clase3;

public class Gallina {
    private int idGallina;
    private double edad;
    private int huevosPuestos;
    
    // constructor gallinas
    
    public Gallina(int idGallina, double edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(int huevos) {
        huevosPuestos = huevosPuestos + huevos;
        System.out.println("La gallina lleva puestos: " + huevosPuestos + " huevos.");
    }
    
    public void envejecer(double anios) {
        edad = edad + anios;
        System.out.println("La gallina tiene: " + edad + " años.");
    }
    
    public void mostrarEstado() { 
        System.out.println("ID de la gallina: " + idGallina);
        System.out.println("Edad de la gallina: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
}