import java.util.Locale;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti conti vuoi creare (1-5): ");
        int currentAccounts = scanner.nextInt();

        //ASSEGNAZIONE DATI INTESTATARIO AI CONTI CORRENTI
        System.out.println("Dati per il conto");
        System.out.println("Inserisci nome intestatario: ");
        String Nome = scanner.nextLine();
        System.out.println("Inserisci cognome intestatario: ");
        String Cognome = scanner.nextLine();
        System.out.println("Inserisci codice fiscale intestatario: ");
        String codiceFiscale = scanner.nextLine();
        System.out.println("Inserisci data di nascita intestatario: ");
        String dataDiNascita = scanner.nextLine();
        System.out.println("\n");
        Intestatario intes1 = new Intestatario(Nome, Cognome, codiceFiscale, dataDiNascita);



        //CREAZIONI CONTI
//        ContoCorrente c0 = new ContoCorrente("123", intes1, 100.0);
//        CartaDiCredito cdc0 = new CartaDiCredito(c0.Iban, c0.Owner, c0.Saldo, "1234", 5678, 909);
//
//        ContoCorrente c1 = new ContoCorrente("345", intes1, 200.0);
//        CartaDiCredito cdc1 = new CartaDiCredito(c1.Iban, c1.Owner, c1.Saldo, "1234", 5678, 909);
//
//        ContoCorrente c2 = new ContoCorrente("678", intes1, 300.0);
//        CartaDiCredito cdc2 = new CartaDiCredito(c2.Iban, c2.Owner, c2.Saldo, "1234", 5678, 909);
//
//        ContoCorrente c3 = new ContoCorrente("901", intes1, 400.0);
//        CartaDiCredito cdc3 = new CartaDiCredito(c3.Iban, c3.Owner, c3.Saldo, "1234", 5678, 909);
//
//        ContoCorrente c4 = new ContoCorrente("234", intes1, 500.0);
//        CartaDiCredito cdc4 = new CartaDiCredito(c4.Iban, c4.Owner, c4.Saldo, "1234", 5678, 909);
//
//        //ASSEGNAZIONE
//        intes1.Elencoconti[0] = c0;
//        intes1.Elencoconti[1] = c1;
//        intes1.Elencoconti[2] = c2;
//        intes1.Elencoconti[3] = c3;
//        intes1.Elencoconti[4] = c4;



//        System.out.println(cdc0.toString());

//        //SCELTA CONTO DA OPERARE
//        boolean sbagliato = true;
//        int i=0;
//        while(sbagliato == true){
//            System.out.println("Su quale conto vuoi operare? (1-5)");
//            i = scanner.nextInt();
//            if(i>=1 && i<=5) {
//                sbagliato = false;
//            }
//            else{
//                System.out.println("Riprova");
//            }
//        }
//
//        //MENU
//        while (true) {
//            System.out.println("\nOperazioni disponibili:");
//            System.out.println("1. Preleva dal conto.");
//            System.out.println("2. Deposita sul conto.");
//            System.out.println("3. Visualizza saldo.");
//            System.out.println("4. Visualizza dati intestatario.");
//            System.out.println("5. Scegli conto");
//            System.out.println("6. Esci");
//
//            System.out.print("Scegli un'opzione: ");
//            int scelta = scanner.nextInt();
//
//            switch (scelta) {
//                case 1:
//                    System.out.print("Inserisci l'importo da prelevare: ");
//                    double ImportoPrelevio = scanner.nextDouble();
//                    intes1.Elencoconti[i - 1].preleva(ImportoPrelevio);
//                    break;
//                case 2:
//                    System.out.print("Inserisci l'importo da depositare: ");
//                    double ImportoDeposito = scanner.nextDouble();
//                    intes1.Elencoconti[i - 1].deposita(ImportoDeposito);
//                    break;
//                case 3:
//                    System.out.println("Saldo attuale: " + intes1.Elencoconti[i - 1].visualizzaSaldo() + " euro");
//                    break;
//                case 4:
//                    intes1.Elencoconti[i - 1].visualizzaSaldo();
//                    break;
//                case 5:
//                    System.out.println("Su quale conto vuoi operare? (1-5)");
//                    i = scanner.nextInt();
//                    break;
//                case 6:
//                    System.out.println("Grazie per aver usato il servizio.");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Opzione non valida. Riprova.");
//            }
//        }
    }
}
