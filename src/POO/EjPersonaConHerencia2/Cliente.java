package POO.EjPersonaConHerencia2;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private Boolean vip;
    private static int contadorId;


    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip){
        //llamamos al constructor de la clase padre para evitar volver a crear dichos atributos ya creados
        super(nombre,genero, edad, direccion);
        //utilizamos la variable estática para incrementar por objeto, el id cliente
        this.idCliente = ++Cliente.contadorId;
        //por cada objeto toma la fecha actual
        this.fechaRegistro = new Date();
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getIsvip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" idCliente: ").append(this.getIdCliente());
        sb.append(" Fecha de registro: ").append(this.getFechaRegistro());
        sb.append(" Es vip: ").append(this.getIsvip());
        return sb.toString();
    }
}

