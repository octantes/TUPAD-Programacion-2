package clase5;

public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composicion
    private Titular2 titular2; // asociacion bidireccional

    public CuentaBancaria (String cbu, double saldo, String codigo, String ultimaModificacion, Titular2 titular2) {
        
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
        this.setTitular2(titular2);
        
    }
    
    public void setTitular2 (Titular2 titular2) {
        
        this.titular2 = titular2;
        
        if (titular2 != null && titular2 .getCuenta() != this) {
            
            titular2.setCuenta(this);
            
        }
        
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular2 getTitular2() { return titular2; }
    
}