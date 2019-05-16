package chapter13_Visitor;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
