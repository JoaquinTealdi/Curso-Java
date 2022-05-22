package POO.CuentaCorriente;

//main class
public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(3000, "Diego Barrios");
        CuentaCorriente cuenta2 = new CuentaCorriente(1500, "Joaquin Tealdi");
        System.out.println("antes de transferencia");
        System.out.println(cuenta1.datosGenerales());
        System.out.println(cuenta2.datosGenerales());

        cuenta1.realizarTransferencia(cuenta2, 1000);

        System.out.println("despues de transferencia");
        System.out.println(cuenta1.datosGenerales());
        System.out.println(cuenta2.datosGenerales());



    }

}
