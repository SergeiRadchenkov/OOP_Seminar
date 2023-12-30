package Classes;

import Interfaces.iActorBehavour;

// Добавляем класс Actor с использованием интэрфейса iActorBehavour
public abstract class Actor implements iActorBehavour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    // конструктор класса
    public Actor(String name) {
        this.name = name;
    }

    // Setter и Getter
    public abstract String getName();
    public abstract void setName();
}
