package clase6;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            Profesor previo = this.profesor;
            this.profesor = null;
            previo.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println(" - Profesor: " + profesor.getNombre());
        } else {
            System.out.println(" - Profesor: no asignado");
        }
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
}