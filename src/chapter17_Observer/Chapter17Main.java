package chapter17_Observer;

public class Chapter17Main {
    public static void main(String[] args) {
//        NumberGenerator generator = new RandomNumberGenerator();
        /*--- kadai17-1 ---*/
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}