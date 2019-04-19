package chapter05_Singleton;

public class Singleton {
    private static Singleton singlton = new Singleton();
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        return singlton;
    }
}
