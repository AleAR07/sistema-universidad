
public class Cuentabancaria implements Transaccionable {

    private double saldo;
    private String numeroCuenta;

    public Cuentabancaria(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    //metodos 
    public double consultarSaldo(double monto) {
        return monto;
    }

    public String obtenerNumero() {
        return numeroCuenta;
    }

    //Metodo que sobreescribe lo de la interface 
    @Override
    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("el nuevo saldo de la cuenta es " + saldo);

    }

    @Override
    public void retirar(double monto) {
        if ((monto > 0) && (monto >= saldo)) {
            saldo = saldo - monto;
            System.out.println("el nuevo saldo es " + saldo + " monto retirado fue de " + monto);

        } else {
            System.out.println("no valido, monto mayor al saldo o retiro de 0");
        }
    }
//getter y setter

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
