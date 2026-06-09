
public class Cuentaahorro extends Cuentabancaria {

    private double montoLimite;
    private double interses;
    private double tasa;

    public Cuentaahorro(double saldo, String numeroCuenta, double montoLimite, double intereses, double tasa) {
        super(saldo, numeroCuenta);
        this.montoLimite = montoLimite;
        this.tasa = tasa;
        this.interses = intereses;
    }

    public double calcularIntereses() {
        interses = (tasa * super.getSaldo() / 100);
        return interses;

    }

    public double getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(double montoLimite) {
        this.montoLimite = montoLimite;
    }

    public double getInterses() {
        return interses;
    }

    public void setInterses(double interses) {
        this.interses = interses;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

}
