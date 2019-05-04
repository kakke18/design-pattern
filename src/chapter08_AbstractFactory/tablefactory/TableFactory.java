package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.Factory;
import chapter08_AbstractFactory.factory.Link;
import chapter08_AbstractFactory.factory.Tray;
import chapter08_AbstractFactory.factory.Page;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
