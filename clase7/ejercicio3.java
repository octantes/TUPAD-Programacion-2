package clase7;
import java.util.ArrayList;

public class ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan", 800));
        empleados.add(new EmpleadoTemporal("Federico", 15, 80));
        empleados.add(new EmpleadoPlanta("Pablo", 1000));
        empleados.add(new EmpleadoTemporal("Ramiro", 20, 80));

        for (Empleado e : empleados) {
            
            System.out.println("El sueldo del empleado " + e.getNombre() + " es: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }

        }

    }
    
}