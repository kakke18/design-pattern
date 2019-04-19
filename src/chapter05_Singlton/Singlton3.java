package chapter05_Singlton;

class Singlton3 {
    private Singlton3(){}

    public static Singlton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singlton3 INSTANCE = new Singlton3();
    }
}
