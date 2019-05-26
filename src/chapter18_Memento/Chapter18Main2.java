package chapter18_Memento;

import chapter18_Memento.game.Gamer;
import chapter18_Memento.game.Memento;

import java.io.*;

public class Chapter18Main2 {
    public static final String SAVEFILENAME = "src/chapter18_Memento/game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状: " + gamer);
            gamer.bet();
            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱い
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （だいぶ増えてきたので、現在の状態を保存しておこう。");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （だいぶ減ってきたので、以前の状態に復帰しておこう。");
                gamer.restoreMemento(memento);
            }

            // 時間待ち
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }

    public static void saveMemento(Memento memento) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento)in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
