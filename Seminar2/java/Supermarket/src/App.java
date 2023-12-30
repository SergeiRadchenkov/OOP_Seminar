import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehavour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Boris", 1);
        Actor client2 = new OrdinaryClient("Olga", 2);
        Actor client3 = new SpecialClient("Philip", 3);
        iActorBehavour client4 = new TaxInspector();
        Actor client5 = new PromotionalClient("Anatoli", 1, "Скидка первым десяти клиентам сайта", 10);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();
    }
}
