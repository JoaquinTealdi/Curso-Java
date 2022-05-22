package POO.Atletas;

public class Atletas {
    private String numeroAtleta;
    private String nombre;
    private float tiempoDeCarrera;

    public Atletas(String numeroAtleta, String nombre, float tiempoDeCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoDeCarrera = tiempoDeCarrera;
    }

    public float getTiempoDeCarrera() {
        return tiempoDeCarrera;
    }

    public String mostrarDatos(){
        return "Numero de atleta: "+ numeroAtleta + "\nNombre: "+ nombre + "\nTiempo de carrera: "+ tiempoDeCarrera +"segundos";
    }
}
