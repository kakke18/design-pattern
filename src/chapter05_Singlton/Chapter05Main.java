package chapter05_Singlton;

public class Chapter05Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singlton obj1 = Singlton.getInstance();
        Singlton obj2 = Singlton.getInstance();
        if (obj1 == obj2) {
            System.out.println("ob1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません。");
        }
        System.out.println("End");
    }
}
