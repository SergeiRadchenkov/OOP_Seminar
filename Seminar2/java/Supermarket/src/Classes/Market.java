package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavour;
import Interfaces.iMarketBehavour;
import Interfaces.iQueueBehavour;

// Добавляем класс Market с использованием интэрфейсов iMarketBehavour,iQueueBehavour
public class Market implements iMarketBehavour,iQueueBehavour {

    private List<iActorBehavour> queue;
    private List<iActorBehavour> returnOrder;

    // конструктор Market
    public Market() {
        this.queue = new ArrayList<iActorBehavour>();
    }

    // переопределяем родительский метод в наследовании
    @Override
    public void acceptToMarket(iActorBehavour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehavour actor) {
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void takeOrder() {
        for (iActorBehavour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (iActorBehavour actor : queue) {
            if (actor.geActor().isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
    for (iActorBehavour actor : actors) {
        System.out.println(actor.geActor().getName() + " клиент ушел из магазина ");
        queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        returnOrder();
    }

    // Метод возврата товара
    private void returnOrder() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент вернул неподходящий товар ");
            }
        }
        releaseFromMarket(releaseActors);
    }
}