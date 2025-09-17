package clase5;

public class Reproductor { // recibe Cancion como parametro pero no lo guarda
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - De: " + cancion.getArtista().getNombre()
                + " - Genero: " + cancion.getArtista().getGenero());
    }
}