package chapter05_Singlton;

public class Chapter05Main5 extends Thread {
    public static void main(String[] args) {
        System.out.println("Start");
        new Chapter05Main5("A").start();
        new Chapter05Main5("B").start();
        new Chapter05Main5("C").start();
        System.out.println("End");
    }
    public void run() {
        Singlton3 obj = Singlton3.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    public Chapter05Main5(String name) {
        super(name);
    }
}
