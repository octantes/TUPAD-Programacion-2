package clase5;

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;  // composicion
    private Propietario propietario; // asociacion bidireccional con Propietario

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
        propietario.setComputadora(this);
        
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
    
}