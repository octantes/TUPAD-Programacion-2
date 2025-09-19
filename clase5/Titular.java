package clase5;

public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociacion bidireccional con Pasaporte
    
    public Titular(String nombre, String dni) {
        
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte() { return pasaporte; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

}