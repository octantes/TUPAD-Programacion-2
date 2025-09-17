package clase5;

public class ejercicio08 {

    public static void main(String[] args) {
        
        Usuario2 u = new Usuario2("Martina Barrios", "martiba@gmail.com");
        Documento d = new Documento("Contrato", "El usuario acepta...", u);

        System.out.println("Documento: " + d.getTitulo());
        System.out.println("Contenido: " + d.getContenido());
        System.out.println("Firma digital: " + d.getFirmaDigital().getCodigoHash() + " Fecha " + d.getFirmaDigital().getFecha());
        System.out.println("Usuario que firma: " + d.getFirmaDigital().getUsuario2().getNombre() + " " + d.getFirmaDigital().getUsuario2().getEmail());
        
    }
    
}