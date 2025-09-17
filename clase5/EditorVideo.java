package clase5;

public class EditorVideo { // crea Render dentro del metodo sin guardarlo
    
    public void exportar(String formato, Proyecto proyecto) {
        
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto: " + proyecto.getNombre() + " Exportado en formato: " + render.getFormato());
        
    }
}