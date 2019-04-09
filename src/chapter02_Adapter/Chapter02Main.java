package chapter02_Adapter;

public class Chapter02Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }
}
