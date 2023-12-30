package Interfaces;

import java.util.List;
import Classes.Actor;

// Определение интерфэйса iMarketBehavour и его методов
public interface iMarketBehavour {
    public void acceptToMarket(iActorBehavour actor);
    public void releaseFromMarket(List<Actor> list);
    public void update();
}
