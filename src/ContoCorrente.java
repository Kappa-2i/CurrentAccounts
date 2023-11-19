class ContoCorrente {
    //ATTRIBUTES
    String Iban;
    double Saldo;
    Intestatario Owner;

    //CONSTRUCTOR
    public ContoCorrente(String iban, Intestatario Ow, double Sal) {
        Iban = iban;
        Owner = Ow;
        Saldo = Sal;
    }


    //METODI:
    //VISUALIZZA
    public double visualizzaSaldo() {
        return Saldo;
    }

    @Override
    public String toString(){
        return "IBAN: " +Iban+ " Saldo: " +Saldo+"€  Intestatario: " +Owner;
    }
}



