package Classes;

import Interfaces.iActorBehavour;

// Добавляем класс TaxInspector с использованием интэрфейса iActorBehavour
public class TaxInspector implements iActorBehavour{
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    // Назначаем имя TaxInspector
    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    public String getName() {
        return name;
    }

    // переопределяем родительский метод в наследовании
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    @Override
    public Actor geActor() {
        return new OrdinaryClient("Тайный покупатель", 4);
    }
}
