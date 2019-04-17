package chapter05_Singlton;

public class Singlton2 {
    private static Singlton2 singlton = null;
    private Singlton2() {
        System.out.println("インスタンスを生成しました。");
        slowdown();
    }
    public static synchronized Singlton2 getInstance() {
        if (singlton == null ) {
            singlton = new Singlton2();
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
