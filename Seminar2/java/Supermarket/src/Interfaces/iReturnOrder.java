package Interfaces;

import java.util.List;

import Classes.Actor;

// Заводим интерфэйс iReturnOrder - возврат товара
public interface iReturnOrder {
    public void returnOrder(List<Actor> actors);
}
