package Interfaces;

import Classes.Actor;

// Определение интерфэйса iActorBehavour и его методов
public interface iActorBehavour {
    
    public boolean isTakeOrder();
        
    public boolean isMakeOrder();
        
    public void setTakeOrder(boolean val);
    
    public void setMakeOrder(boolean val);
    
    public Actor geActor();
}