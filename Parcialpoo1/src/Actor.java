public class Actor {

    //ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int añoDeNacimiento;

    //CONSTRUCTOR
    public Actor(String nombre, String apellido, String pais, int añoDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.añoDeNacimiento = añoDeNacimiento;
    }
    //METODO
    public void calcularEdad(int añoActual){
    añoActual=2021;
    añoActual=añoActual-añoDeNacimiento;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "actor"+this.nombre+" "+ this.apellido+" Nacido en "+this.pais;
    }


}
