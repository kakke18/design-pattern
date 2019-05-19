package chapter15_Facade;

import chapter15_Facade.pagemaker.PageMaker;

public class Chapter15Main {
    public static void main(String[] args) {
//        PageMaker.makeWelcomePage("hyuki@hyuki.com", "src/chapter15_Facade/welcome.html");
        /*--- kadai15-2 ---*/
        PageMaker.makeLinkPage("src/chapter15_Facade/link.html");
    }
}
