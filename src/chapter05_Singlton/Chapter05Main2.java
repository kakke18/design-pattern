package chapter05_Singlton;

public class Chapter05Main2 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0 ; i < 10; i++) {
            System.out.println(i + "：" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End");
    }
}
