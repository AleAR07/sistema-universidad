
public class Cuentacorriente extends Cuentabancaria {

    private double comision;

    public Cuentacorriente(double saldo, String numeroCuenta, double comision) {
        super(saldo, numeroCuenta);
        this.comision = comision;
    }

    public void girarcheque(double monto) {
        if ((monto > super.getSaldo()) || (monto < 0)) {
            System.out.println("no se puede hacer (monto mayor que el saldo)");
        } else {
            super.retirar(monto);
            System.out.println("cheque girado " + getSaldo());
        }
    }

    public void cobrarComision() {
        retirar(comision * getSaldo());
    }
//getter y setter

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

}
