package chapter18_Memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {
            "リンゴ", "ぶどう", "バナナ", "みかん"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        if (dice == 1) {
            money += 100;
            System.out.println("所持金が増えました。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金が半分になりました。");
        } else if (dice == 6) {
            String f = getFruits();
            System.out.println("フルーツ（" + f + "）をもらいました。");
            fruits.add(f);
        } else {
            System.out.println("何も起こりませんでした。");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("おいしい")) {
                m.addFruits(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento m) {
        this.money = m.money;
        this.fruits = m.fruits;
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
