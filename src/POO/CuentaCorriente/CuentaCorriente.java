package POO.CuentaCorriente;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;
    CuentaCorriente Cuentas[];
    //constructor
    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = (long) (Math.random() * 20);
    }

    public double getSaldo() {
        return saldo;
    }

    public String datosGenerales(){
        return "Titular de Cuenta:" + nombreTitular + "\nNumero de Cuenta:" + numeroCuenta + "\nSaldo: " + saldo;
    }

    public void ingresarDinero(double dinero) {
        this.saldo += dinero;
    }

    public void reintegro(double dinero){
        this.saldo += dinero;
    }

    public void realizarTransferencia(CuentaCorriente cuenta2, double monto){

        if(this.saldo < monto)
            System.out.println("Saldo insuficiente");
        else{
            this.saldo -= monto;
            cuenta2.saldo += monto;
            System.out.println("Transferencia exitosa");
        }

    }
}
