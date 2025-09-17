package clase5;

public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora; // asociacion bidireccional con Computadora

    public Propietario(String nombre, String dni) {
        
        this.nombre = nombre;
        this.dni = dni;
        
    }

    public void setComputadora(Computadora computadora) {
        
        this.computadora = computadora;
        
    }

    public Computadora getComputadora() { return computadora; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    
}