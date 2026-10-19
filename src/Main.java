import static java.lang.IO.println;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContoBancario C = new ContoBancario(3000d);

    try{
        C.Preleva(3000d);
        println("Operazione avvenuta con successo.");
    }catch(SaldoInsufficienteException e){
        println(e.getMessage());
    }catch(ImportoNonValidoException e) {
        println(e.getMessage());
    }


    /*  TEST 1 SALDO INSUFFICIENTE
    try{
        C.Preleva(3001d);
    }catch(SaldoInsufficienteException e){
        println(e.getMessage());
    }*/

    /*  TEST 2 IMPORTO NON VALIDO
    try{
        C.Preleva(-1d);
    }catch(SaldoInsufficienteException e) {
        println(e.getMessage());
    }*/


}
