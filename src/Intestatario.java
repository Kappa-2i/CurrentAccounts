import java.time.LocalDate;

class Intestatario {
    //ATTRIBUTES
    public String Nome;
    public String Cognome;
    public String codiceFiscale;
    public String dataNascita;
    ContoCorrente elencoConti[] = new ContoCorrente[5];

    //CONSTRUCTOR
    public Intestatario(String nome, String cognome, String codiceFiscale, String dataNascita) {
        this.Nome = nome;
        this.Cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataNascita =dataNascita;
    }


    //METHODS
    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }
    //STAMPA DATI
    public void stampaDati() {
        System.out.println("Nome: " +Nome);
        System.out.println("Cognome: " +Cognome);
        System.out.println("Codice Fiscale: " +codiceFiscale);
        System.out.println("Data di Nascita: " +dataNascita);
    }

    @Override
    public String toString(){
        return "Nome: " +Nome+ " Cognome: " +Cognome;
    }
}