package Classes;

// Добавляем класс SpecialClient , наследник Actor
public class SpecialClient extends Actor {

    private int vipId;

    // конструктор SpecialClient
    public SpecialClient(String name, int number) {
        super(name);
        this.vipId = vipId;
    }

    // переопределяем родительский метод в наследовании
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {
        this.name = name;
    }
    
    public int getVipId() {
        return vipId;
    }
    public void setVipId(int number) {
        this.vipId = vipId;
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
