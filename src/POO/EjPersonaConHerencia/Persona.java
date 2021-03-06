package POO.EjPersonaConHerencia;

public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    

    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre);
        sb.append("Genero: ").append(this.genero);
        sb.append("Edad: ").append(this.edad);
        sb.append("Direccion: ").append(this.direccion);
        return sb.toString();
    }
}
