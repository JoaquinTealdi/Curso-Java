package POO.EjPersonaConHerencia2;

import POO.EjPersonaConHerencia.Persona;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorempleado;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo){
        super(nombre,genero, edad, direccion);
        this.idEmpleado = ++Empleado.contadorempleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idEmpleado: ").append(this.idEmpleado);
        sb.append(" || Nombre: ").append(this.getNombre());
        sb.append(" || Genero: ").append(this.getGenero());
        sb.append(" || edad: ").append(this.getEdad());
        sb.append(" || Direccion: ").append(this.getDireccion());
        sb.append(" || Sueldo: ").append(this.sueldo);
        return sb.toString();
    }


}
