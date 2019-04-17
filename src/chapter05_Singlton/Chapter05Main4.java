package chapter05_Singlton;

public class Chapter05Main4 extends Thread {
    public static void main(String[] args) {
        System.out.println("Start");
        new Chapter05Main4("A").start();
        new Chapter05Main4("B").start();
        new Chapter05Main4("C").start();
        System.out.println("End");
    }
    public void run() {
        Singlton2 obj = Singlton2.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    public Chapter05Main4(String name) {
        super(name);
    }
}
