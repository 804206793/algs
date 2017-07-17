package com.jane.pattern.Factory;

/**
 * Created by wang_gkun on 2017/7/17.
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } return null;
    }

}
