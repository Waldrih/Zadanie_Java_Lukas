import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Rozpoczęcie zadanie Lukas");

        Client klientRobert = new Client("Robert D.","Kraków", "robert.mail.com");

        Product sofa1 = new Product("sofa IKEA", "01.01.2021", 100, "Wygodna sofa");
        Product sofa2 = new Product("sofa BRW", "02.02.2022", 200);
        Product stol1 = new Product("stół STOLARZ","11.11.2011",11,"Stary stół");
        Product stol2 = new Product("stół SKLEJKA", "12.12.2012", 12);
        Product fotel1 = new Product("fotel GAMINGOWY", "01.07.1991", 500, "Wymarzony fotel");
        Product fotel2 = new Product("fotel ZWYKŁY", "18.12.1995", 600);

        List<Product> lista1 = new ArrayList<>();
        lista1.add(sofa1);
        lista1.add(stol1);
        lista1.add(stol2);

        Order zamowienie1 = new Order(1111, "05.11.2023", lista1, FormOfDelivery.POST, PaymentMethod.CASH);

        Sending wysylka1 = new Sending(zamowienie1, klientRobert);
        wysylka1.realization();

       // System.out.println(lista1);
    }
}