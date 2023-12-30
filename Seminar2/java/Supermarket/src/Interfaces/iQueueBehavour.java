package Interfaces;

import Classes.Actor;

// Определение интерфэйса iQueueBehavour и его методов
public interface iQueueBehavour {
     public void takeInQueue(iActorBehavour actor);
     public void releaseFromQueue();
     public void takeOrder();
     public void giveOrder();
}
