package chapter05_Singlton;

public class Singlton {
    private static Singlton singlton = new Singlton();
    private Singlton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singlton getInstance() {
        return singlton;
    }
}
