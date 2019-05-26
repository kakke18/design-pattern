package chapter18_Memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*--- kadai18-4 ---*/
public class Memento implements Serializable {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List)fruits.clone();
    }
}
