package chapter05_Singleton;

class Singleton3 {
    private Singleton3(){}

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
