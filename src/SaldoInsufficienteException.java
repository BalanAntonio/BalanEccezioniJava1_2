public class SaldoInsufficienteException extends Exception {
    double SaldoAttuale; double ImportoRichiesto;

    public SaldoInsufficienteException(String message, double SaldoAttuale, double ImportoRichiesto) {
        super(message);
        this.SaldoAttuale = SaldoAttuale;
        this.ImportoRichiesto = ImportoRichiesto;
    }


}
