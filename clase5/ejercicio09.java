package clase5;

public class ejercicio09 {

    public static void main(String[] args) {
        
        Paciente p = new Paciente("Matias Fernandez", "OSDE");
        Profesional pr = new Profesional("Dr. Rodriguez", "Cardiologia");
        CitaMedica c = new CitaMedica("2025-10-01", "15:30", p, pr);

        System.out.println("Cita medica: " + c.getFecha() + " a las " + c.getHora());
        System.out.println("Paciente: " + c.getPaciente().getNombre() + " Obra social: " + c.getPaciente().getObraSocial());
        System.out.println("Profesional: " + c.getProfesional().getNombre() + " Especialidad: " + c.getProfesional().getEspecialidad());
        
    }
    
}