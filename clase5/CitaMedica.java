package clase5;

public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente; // asociacion unidireccional
    private Profesional profesional; // asociacion unidireccional

    public CitaMedica(String fecha, String hora) {
        
        this.fecha = fecha;
        this.hora = hora;

    }
    
    public void setPaciente(Paciente paciente) {
        
        this.paciente = paciente;
        
    }

    public void setProfesional(Profesional profesional) {
        
        this.profesional = profesional;
        
    }
    
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
    
}