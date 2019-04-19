package chapter05_Singleton;

public class Singleton2 {
    private static Singleton2 singlton = null;
    private Singleton2() {
        System.out.println("インスタンスを生成しました。");
        slowdown();
    }
    public static synchronized Singleton2 getInstance() {
        if (singlton == null ) {
            singlton = new Singleton2();
        }
        return singlton;
    }
    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
