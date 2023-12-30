package Classes;

// Добавляем класс Акционный Клиент, наследник Actor
public class PromotionalClient extends Actor {
    
    // объявляем название акции
    private String promoName;
    // объявляем ID акционного клиента
    private int promoClientID;
    // объявляем количество участников акции (статическое)
    static int numberOfParticipants;
    
    // конструктор PromotionalClient
    public PromotionalClient(String name, int promoClientID, String promoName, 
    int numberOfParticipants) {
        super(name);
        this.promoClientID = promoClientID;
        this.promoName = promoName;
        this.numberOfParticipants = numberOfParticipants;
    }

    // Устанавливаем Setters и Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {
        this.name = name;
    }
    
    public int getPromoClientID() {
        return promoClientID;
    }
    public void setNumber(int promoClientID) {
        this.promoClientID = promoClientID;
    }
    public String getPromoName() {
        return promoName;
    }
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }
    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
        
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
        
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }
    
    public Actor geActor() {
        return this;
    }
}
