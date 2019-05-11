package chapter12_Decorator;

public class Chapter12Main3 {
    public static void main(String[] args) {
        MultiDisplay md = new MultiDisplay();
        md.add("Good Mornig.");
        md.add("Hello.");
        md.add("Good Night.");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
