package clase4;

public class Empleado {
    
    private int    id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    private static int contadorId     = 0;
    
    private static final int SALARIO_DEFAULT = 1000;
    
    // constructor sobrecargado para pasar todos los atributos como parametros
    // segun la consigna el id deberia pasarse tambien, yo lo haria automatico
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id      = id;
        this.nombre  = nombre;
        this.puesto  = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // constructor sobrecargado para id automatico y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id      = ++contadorId;
        this.nombre  = nombre;
        this.puesto  = puesto;
        this.salario = SALARIO_DEFAULT;
        totalEmpleados++;
    }
    
    // metodo sobrecargado para actualizar salario usando porcentaje
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }
    
    // metodo sobrecargado para actualizar el salario con cantidad fija
    public void actualizarSalario(int cantidadAumento) {
        this.salario += cantidadAumento;
    }
    
    // metodo para retornar el total de empleados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    // override al toString para devolver el estado
    @Override
    public String toString() {
        return "Empleado {"
                + " id=" + id
                + ", nombre="  + nombre
                + ", puesto="  + puesto
                + ", salario=" + salario
                + "}";
    }
    
}