package clase5;

public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente; // asociacion unidireccional

    public Impuesto (double monto) {
        
        this.monto = monto;
        
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        
        this.contribuyente = contribuyente;
        
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
    
}