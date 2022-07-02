package POO.EjPersonaConHerencia2;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private Boolean vip;
    private static int contadorId;

    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip){
        super(nombre,genero, edad, direccion);
        this.idCliente = ++Cliente.contadorId;
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

