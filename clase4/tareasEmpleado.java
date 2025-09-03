package clase4;

public class tareasEmpleado {
    
    public static void main(String[] args) {
        
        /* instanciamos dos empleados pasando todos los atributos como parametros
        hay que tener especial cuidado con los ids para no repetir los automaticos
        los asignaremos manualmente a partir del 100 para prevenir repeticion */
        
        Empleado E1 = new Empleado(101, "Juan", "Ingeniero", 2000);
        Empleado E2 = new Empleado(102, "Pedro", "Programador", 1000);
        
        // instanciamos dos empleados con id y salario automaticos
        Empleado E3 = new Empleado("Roberto", "Diseñador");
        Empleado E4 = new Empleado("Mariano", "Analista");
        
        // imprimimos su estado inicial usando el override de toString()
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println(E4);
        
        // aplicamos la version porcentual de actualizarSalario sobre E1 y E3
        E1.actualizarSalario(25.0);
        E3.actualizarSalario(60.0);
        
        // aplicamos la version fija de actualizarSalario sobre E2 y E4
        E2.actualizarSalario(250);
        E4.actualizarSalario(600);
        
        // imprimimos su estado final usando el override de toString()
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println(E4);
        
        // mostramos la cantidad total de empleados creados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
}

