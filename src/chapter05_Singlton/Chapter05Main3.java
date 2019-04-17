package chapter05_Singlton;

public class Chapter05Main3 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0 ; i < 9; i++) {
            Triple tripe = Triple.getInstance(i % 3);
            System.out.println(i + "：" + tripe);
        }
        System.out.println("End");
    }
}
