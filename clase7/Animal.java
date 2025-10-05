package clase7;

public class Animal {
    
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido animal");
    }

    public void describirAnimal() {
        System.out.println("El " + this.getClass().getSimpleName() + " se llama " + nombre);
    }
    
}
