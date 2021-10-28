public class Main {
    public static void main(String[] args) {


    Actor primerActor = new Actor("Cristian","Javier","Argentina",1989);
    Actor segundoActor = new Actor("Javier","Maximiliano","Argentina",1990);
    Actor tercerActor = new Actor("Maximiliano","Cristian","Africa",1991);
    Actor cuartoActor = new Actor("Cristian","Javier","Alemania",1989);

    Pelicula primerPelicula = new Pelicula("Titanic",120,2000,"Romance");
    Pelicula segundaPelicula = new Pelicula("El Rey Leon", 120,2000,"Infantil");

    Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        primerPelicula.agregarActor(primerActor);
        primerPelicula.agregarActor(segundoActor);

        segundaPelicula.agregarActor(tercerActor);
        segundaPelicula.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(primerPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        primerPelicula.mostrarActores();
        segundaPelicula.mostrarActores();

        nuevoCine.mostrarPelicula();
    }

}
