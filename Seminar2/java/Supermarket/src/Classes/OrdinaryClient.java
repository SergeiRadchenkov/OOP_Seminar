package Classes;

// Добавляем класс OrdinaryClient , наследник Actor
public class OrdinaryClient extends Actor {
    
    private int number;

    // конструктор OrdinaryClient
    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }

    // переопределяем родительский метод в наследовании
    @Override
    public String getName() {
        return name;
    }

    // Устанавливаем Setters и Getters
    @Override
    public void setName() {
        this.name = name;
    }
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
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
