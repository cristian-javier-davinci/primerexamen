import java.util.ArrayList;

public class Cine {
    //ATRIBUTOS
    String Nombre;
    String Ciudad;
    ArrayList<Pelicula> peliculas= new ArrayList<Pelicula>();

    //CONSTRUCTORES

    public Cine(String nombre, String ciudad) {
        Nombre = nombre;
        Ciudad = ciudad;
    }

    public Cine(String nombre) {
        Nombre = nombre;
    }
    //METODO
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    public void removerPelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    public void mostrarPelicula() {
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(this.peliculas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Bienvenido al cine "+ this.Nombre;
    }
}
