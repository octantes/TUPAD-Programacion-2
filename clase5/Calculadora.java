package clase5;

public class Calculadora { // recibe Cancion como parametro pero no lo guarda
    public void calcular (Impuesto impuesto) {
        System.out.println("Calculando impuesto de " + impuesto.getContribuyente().getNombre()
                + " CUIL: " + impuesto.getContribuyente().getCuil() + ": $" + impuesto.getMonto());
    }
}