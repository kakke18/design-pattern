package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
