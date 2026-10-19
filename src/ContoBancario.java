public class ContoBancario {
    double Saldo;

    public void Preleva(double q) throws SaldoInsufficienteException {
        if(q<=0d){
            throw new ImportoNonValidoException("Errore! L'importo da prelevare deve essere maggiore di 0");
        }

        if(q > Saldo){
            throw new SaldoInsufficienteException("Errore!!! Saldo insufficiente.", Saldo, q);
        }else{
            Saldo -= q;
        }
    }

    public ContoBancario(double Saldo){
        this.Saldo = Saldo;
    }
}

