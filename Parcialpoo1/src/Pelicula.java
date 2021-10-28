import java.util.ArrayList;

public class Pelicula {
    //ATRIBUTOS

    String titulo;
    int duracion;
    int año;
    String Categoria;
    ArrayList<Actor> actores= new ArrayList<Actor>();

    //CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int año, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.año = año;
        Categoria = categoria;
    }
    public Pelicula(String titulo) {
        this.titulo = titulo;
    }
    //METODOS

    public void agregarActor(Actor actores) {
        this.actores.add(actores);
    }
    public void removerActor(Actor actores){
        this.actores.remove(actores);
    }
    public void mostrarActores(){
        for (int i = 0; i < actores.size() ; i++) {
            System.out.println(this.actores.get(i));
        }
    }
    @Override
    public String toString() {
        return this.titulo+" ("+this.año+")";
    }
}
