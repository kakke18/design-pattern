package chapter09_Bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int maxTime) {
        multiDisplay(random.nextInt(maxTime));
    }
}
