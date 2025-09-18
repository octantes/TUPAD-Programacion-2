package clase5;

public class Titular2 {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // asociacion bidireccional con CuentaBancaria

    public Titular2 (String nombre, String dni) {
        
        this.nombre = nombre;
        this.dni = dni;
        
    }

    public void setCuenta (CuentaBancaria cuenta) {
        
        this.cuenta = cuenta;
        
        if (cuenta != null && cuenta.getTitular2() != this) {
            
            cuenta.setTitular2(this);
            
        }
        
    }

    public CuentaBancaria getCuenta() { return cuenta; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    
}