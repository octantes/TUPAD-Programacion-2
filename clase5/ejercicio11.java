package clase5;

public class ejercicio11 {

    public static void main(String[] args) {
       
        Artista a = new Artista("Dano", "Rap");
        Cancion c = new Cancion("La lluvia y el sol");
        Reproductor r = new Reproductor();
        
        c.setArtista(a);
        r.reproducir(c);
        
    }
    
}