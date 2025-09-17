package clase5;

public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular; // asociacion bidireccional con Celular
    
    public Usuario(String nombre, String dni) {
        
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }

}