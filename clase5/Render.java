package clase5;

public class Render {
    
    private String formato;
    private Proyecto proyecto; // asociacion unidireccional

    public Render (String formato) {
        
        this.formato = formato;
        
    }
    
    public void setProyecto(Proyecto proyecto) {
        
        this.proyecto = proyecto;
        
    }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
    
}
