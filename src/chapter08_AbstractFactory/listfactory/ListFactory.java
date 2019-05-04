package chapter08_AbstractFactory.listfactory;

import chapter08_AbstractFactory.factory.Factory;
import chapter08_AbstractFactory.factory.Link;
import chapter08_AbstractFactory.factory.Page;
import chapter08_AbstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
