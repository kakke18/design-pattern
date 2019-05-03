package chapter07_Builder;

//public class TextBuilder implements Builder {
public class TextBuilder extends Builder {
    /*--- サンプルプログラム ---*/
//    private StringBuffer buffer = new StringBuffer();
//
//    @Override
//    public void makeTitle(String title) {
//        buffer.append("==============================\n");
//        buffer.append("『" + title + "』\n");
//        buffer.append("\n");
//    }
//
//    @Override
//    public void makeString(String str) {
//        buffer.append('■' + str + "\n");
//        buffer.append("\n");
//    }
//
//    @Override
//    public void makeItems(String[] items) {
//        for (int i = 0; i < items.length; i++) {
//            buffer.append(" ・" + items[i] + "\n");
//        }
//        buffer.append("\n");
//    }
//
//    @Override
//    public void close() {
//        buffer.append("==============================\n");
//    }
//
//    public String getResult() {
//        return buffer.toString();
//    }

    /*--- 問題7-2（Templete Methodパターン） ---*/
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    @Override
    public void buildString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void buildDone() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
