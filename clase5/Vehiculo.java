package clase5;

class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor; // agregacion
    private Conductor conductor; // asociacion bidireccional con Conductor

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.setConductor(conductor);
        
    }
    
    public void setConductor(Conductor conductor) {
        
        this.conductor = conductor;
        
        if (conductor != null && conductor.getVehiculo() != this) {
            
            conductor.setVehiculo(this);
            
        }
        
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
    
}