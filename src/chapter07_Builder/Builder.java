package chapter07_Builder;

//public interface Builder {
public abstract class Builder {
    /*--- サンプルプログラム ---*/
//    public abstract void makeTitle(String title){}
//    public abstract void makeString(String str);
//    public abstract void makeItems(String[] items);
//    public abstract void close();

    /*--- 問題7-2（Templete Methodパターン） ---*/
    private boolean initialized = false;
    public void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }
    public void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }
    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }
    public void close() {
        if (initialized) {
            buildDone();
        }
    }

    public abstract void buildTitle(String title);
    public abstract void buildString(String str);
    public abstract void buildItems(String[] items);
    public abstract void buildDone();
}
