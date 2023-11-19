import java.time.LocalDate;
import java.util.Scanner;

public class CartaDiCredito extends ContoCorrente{
    Scanner scanner = new Scanner(System.in);
    //ATRTIBUTI
    String PAN;
    int PIN;
    int CVV;

    //CONSTRUCTOR CON CONSTRUCTOR DI CONTO CORRENTE TRAMITE SUPER
    public CartaDiCredito(String iban, Intestatario intes, double sald, String pan, int pin, int cvv){
        super(iban, intes, sald);
        PAN = pan;
        PIN = pin;
        CVV = cvv;
    }

    //METODI
    public void stampaDati() {
        System.out.println("Iban: " +Iban);
        System.out.println("Nome: " +Owner.Nome);
        System.out.println("Cognome: " +Owner.Cognome);
        System.out.println("Saldo: " +Saldo);
        System.out.println("PAN: " +PAN);
        System.out.println("PIN: " +PIN);
        System.out.println("CVV: " +CVV);
    }

    //PRELIEVO
    public void preleva(double importo) {
        int tentativi_pin = 3;
        while (tentativi_pin >=0){

            System.out.println("Inserisci Pin Carta: ");
            int demoPin = scanner.nextInt();

            if(demoPin == PIN){
                if (importo > 0 && importo <= Saldo){
                    Saldo = Saldo - importo;
                    System.out.println("Hai prelevato: " +importo+ " euro");
                    System.out.println("Saldo attuale: " +Saldo+ " euro");
                    tentativi_pin = -1;
                }
            }
            else{
                System.out.println("Pin non valido hai a disposizione " +tentativi_pin+ " tentativi_pin.");
                tentativi_pin--;
            }
        }
    }

    //DEPOSITO
    public void deposita(double importo){
        if (importo > 0) {
            Saldo = Saldo + importo;
            System.out.println("Hai depositato: " +importo+ " euro");
            System.out.println("Saldo attuale: " +Saldo+ " euro");
        } else {
            System.out.println("Importo non valido.");
        }
    }
}




