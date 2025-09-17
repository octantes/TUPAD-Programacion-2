package clase5;

public class ejercicio02 {

    public static void main(String[] args) {

        Usuario u = new Usuario("Cristian Alvarez", "30913501");
        Bateria b = new Bateria("SA-101", 1000);
        Celular c = new Celular("IMEI123456", "Nokia", "1100", b, u);

        System.out.println("Usuario: " + c.getUsuario().getNombre());
        System.out.println("Celular del usuario: " + u.getCelular().getMarca() + " " + u.getCelular().getModelo());
        System.out.println("Bateria: " + c.getBateria().getModelo());
        
    }
    
}