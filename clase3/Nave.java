package clase3;

public class Nave {
    
    // declaramos los atributos
    public String nombre;
    public double combustible;

    //declaramos los metodos
    public void despegar() { 
        if (combustible >= 5) {
            System.out.println("Despegando!");
        } else {
            System.out.println("Necesita mas de 5 de combustible para despegar!");
        }
    }
    
    public void avanzar(double distancia) {
        double gasto = distancia * 0.25;
        if (combustible >= gasto) {
            combustible = combustible - gasto;
            System.out.println("Avanzaste " + distancia + " Km!");
        } else {
            System.out.println("Necesita mas combustible para avanzar " + distancia + " Km!");
        }
    }
    
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad >= 100) {
            combustible = 100;
            System.out.println("El tanque esta lleno!");
        } else {
            combustible = combustible + cantidad;
            System.out.println(combustible + " % del tanque esta lleno.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("El nombre de la nave es: " + nombre);
        System.out.println(combustible + " % del tanque esta lleno.");
    }
    
}
