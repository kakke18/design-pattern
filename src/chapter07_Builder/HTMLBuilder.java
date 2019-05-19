package chapter07_Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//public class HTMLBuilder implements Builder {
public class HTMLBuilder extends Builder {
    /*--- サンプルプログラム ---*/
//    private String filename;
//    private PrintWriter writer;
//
//    @Override
//    public void makeTitle(String title) {
//        filename = "src/chapter07_Builder/" + title + ".html";
//        try {
//            writer = new PrintWriter(new FileWriter(filename));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        writer.println("<html><head><title>" + title + "</title></head><body>");
//        writer.println("<h1>" + title + "</h1>");
//    }
//
//    @Override
//    public void makeString(String str) {
//        writer.println("<p>" + str + "</p>");
//    }
//
//    @Override
//    public void makeItems(String[] items) {
//        writer.println("<ul>");
//        for (int i = 0; i < items.length; i++) {
//            writer.println("<li>" + items[i] + "</li>");
//        }
//        writer.println("</ul>");
//    }
//
//    @Override
//    public void close() {
//        writer.println("</body></html>");
//        writer.close();
//    }
//
//    public String getResult() {
//        return filename;
//    }

    /*--- 問題7-2（Templete Methodパターン） ---*/
    private String filename;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        filename = "src/chapter07_Builder/" + title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
