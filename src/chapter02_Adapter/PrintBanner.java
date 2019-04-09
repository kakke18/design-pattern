package chapter02_Adapter;

/*--- 継承によるAdapterパターン ---*/
//public class PrintBanner extends Banner implements Print {
//    public PrintBanner(String string) {
//        super(string);
//    }
//    public void printWeek() {
//        showWithParen();
//    }
//    public void printStrong() {
//        showWithAster();
//    }
//}

/*--- インスタンスによるAdapterパターン ---*/
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeek() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
